/**
 */
package bitub.support.p2.provider;

import bitub.support.p2.LocationType;
import bitub.support.p2.P2Factory;
import bitub.support.p2.P2Package;

import bitub.support.p2.edit.P2EditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bitub.support.p2.LocationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationTypeItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addIncludeAllPlatformsPropertyDescriptor(object);
      addIncludeConfigurePhasePropertyDescriptor(object);
      addIncludeModePropertyDescriptor(object);
      addIncludeSourcePropertyDescriptor(object);
      addTypePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Include All Platforms feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIncludeAllPlatformsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_LocationType_includeAllPlatforms_feature"),
            getString("_UI_PropertyDescriptor_description", "_UI_LocationType_includeAllPlatforms_feature",
                "_UI_LocationType_type"),
            P2Package.Literals.LOCATION_TYPE__INCLUDE_ALL_PLATFORMS, true, false, false,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Include Configure Phase feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIncludeConfigurePhasePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(), getString("_UI_LocationType_includeConfigurePhase_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_LocationType_includeConfigurePhase_feature",
            "_UI_LocationType_type"),
        P2Package.Literals.LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
        null, null));
  }

  /**
   * This adds a property descriptor for the Include Mode feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIncludeModePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(), getString("_UI_LocationType_includeMode_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_LocationType_includeMode_feature", "_UI_LocationType_type"),
        P2Package.Literals.LOCATION_TYPE__INCLUDE_MODE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
        null));
  }

  /**
   * This adds a property descriptor for the Include Source feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIncludeSourcePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors
        .add(
            createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_LocationType_includeSource_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LocationType_includeSource_feature",
                    "_UI_LocationType_type"),
                P2Package.Literals.LOCATION_TYPE__INCLUDE_SOURCE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
  }

  /**
   * This adds a property descriptor for the Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(), getString("_UI_LocationType_type_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_LocationType_type_feature", "_UI_LocationType_type"),
        P2Package.Literals.LOCATION_TYPE__TYPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(P2Package.Literals.LOCATION_TYPE__UNIT);
      childrenFeatures.add(P2Package.Literals.LOCATION_TYPE__REPOSITORY);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns LocationType.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/LocationType"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public String getText(Object object)
  {
    LocationType locationType = (LocationType) object;
    return getString("_UI_LocationType_type") + " ("
        + (null != locationType.getRepository() ? locationType.getRepository().getLocation() : "") + ")";
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(LocationType.class)) {
      case P2Package.LOCATION_TYPE__INCLUDE_ALL_PLATFORMS:
      case P2Package.LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE:
      case P2Package.LOCATION_TYPE__INCLUDE_MODE:
      case P2Package.LOCATION_TYPE__INCLUDE_SOURCE:
      case P2Package.LOCATION_TYPE__TYPE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case P2Package.LOCATION_TYPE__UNIT:
      case P2Package.LOCATION_TYPE__REPOSITORY:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(P2Package.Literals.LOCATION_TYPE__UNIT, P2Factory.eINSTANCE.createUnitType()));

    newChildDescriptors
        .add(createChildParameter(P2Package.Literals.LOCATION_TYPE__REPOSITORY, P2Factory.eINSTANCE.createRepositoryType()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return P2EditPlugin.INSTANCE;
  }

}
