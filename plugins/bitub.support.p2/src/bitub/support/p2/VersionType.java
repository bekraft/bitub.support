package bitub.support.p2;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 * @author bernold - 02.01.2015
 */
public class VersionType implements Comparable<VersionType>
{
  final private String[] parts;

  /** 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   * @param unitVersion
   */
  public VersionType(String unitVersion)
  {
    parts = unitVersion.split("\\."); //$NON-NLS-1$
    if(0==parts.length) {
      throw new IllegalArgumentException("Expecting \"X.Y.Z.STAMP\" formated string.");
    }
  }
  
  public static VersionType generate(int major, int minor, int micro)
  {
    return new VersionType(String.format("%d.%d.%d", major, minor, micro));
  }

  public static VersionType generate(int major, int minor, int micro, String stamp)
  {
    if(null==stamp) {
      return generate(major, minor, micro);          
    }
    
    return new VersionType(String.format("%d.%d.%d.%s", major, minor, micro, stamp));
  }
  
  public boolean isEmptyVersion()
  {
    return 0 == getMajor() && 0 == getMinor() && 0 == getRelease();
  }

  @Override
  public String toString()
  {
    return parts[0] +"."+ parts[1] +"."+ parts[2] +"."+ parts[3];
  }
  
  public int getMajor()
  {
    return 0<parts.length? Integer.parseInt(parts[0]) : 0;
  }
  
  public int getMinor()
  {
    return 1<parts.length? Integer.parseInt(parts[1]) : 0;
  }
  
  public int getRelease()
  {
    return 2<parts.length? Integer.parseInt(parts[2]) : 0;
  }

  public String getStamp()
  {
    return 3<parts.length? parts[3] : null;
  }

  @Override
  public int compareTo(VersionType o)
  {
    int diff = getMajor() - o.getMajor();
    if(0!=diff) {
      return diff;
    }
    
    diff = getMinor() - o.getMinor();
    if(0!=diff) {
      return diff;
    }

    diff = getRelease() - o.getRelease();
    if(0!=diff) {
      return diff;
    }

    return getStamp().compareTo(o.getStamp());
  }

}
