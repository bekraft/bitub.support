package bitub.support.p2.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import bitub.support.p2.LocationType;
import bitub.support.p2.TargetType;
import bitub.support.p2.UnitType;

public final class MavenUtil
{
  public static Element convertToConfigurationSection(List<LocationType> locationTypes) throws ParserConfigurationException
  {
    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    Document document = builderFactory.newDocumentBuilder().newDocument();
    
    Element configElement = document.createElement("configuration");
    Element sourceElement = document.createElement("source");
    Element iusElement = document.createElement("ius");
    configElement.appendChild(sourceElement);
    configElement.appendChild(iusElement);
    document.adoptNode(configElement);
    
    Map<String, UnitType> unitRegistry = new HashMap<>();
    Set<String> locationSet = new HashSet<>();
    for(LocationType location : locationTypes ) {
      
      if(!locationSet.contains(location.getRepository().getLocation())) {
        
        Element repoElement = document.createElement("repository");
        repoElement.appendChild( document.createElement("url") ).setTextContent(location.getRepository().getLocation() );
        repoElement.appendChild( document.createElement("layout") ).setTextContent( "p2" );
        sourceElement.appendChild(repoElement);
        
        locationSet.add(location.getRepository().getLocation());
      }
      
      for(UnitType unit : location.getUnit() ) {
        
        
        UnitType otherUnit = unitRegistry.get(unit.getId());
        if(null!=otherUnit) {
          
          if(0<unit.getVersion().compareTo(otherUnit.getVersion())) {
            
            unitRegistry.put(unit.getId(), unit);
          } 
          
          continue;
        }
        
        Node queryNode = iusElement.appendChild(document.createElement("iu")).appendChild(document.createElement("query"));        
        queryNode.appendChild(document.createElement("expression")).setTextContent("id == $0");        
        queryNode.appendChild(document.createElement("parameters")).setTextContent(unit.getId());
      }
    }
    
    return configElement;    
  }
  
  
  public static Element convertToConfigurationSection(TargetType target) throws ParserConfigurationException
  {
    return convertToConfigurationSection(target.getLocations().getLocation());
  }
}
