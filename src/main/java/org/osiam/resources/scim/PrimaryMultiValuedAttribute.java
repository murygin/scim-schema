package org.osiam.resources.scim;

public interface PrimaryMultiValuedAttribute {

	Boolean isPrimary();
	
	public static interface Builder <T>{
		T setPrimary(Boolean primary);
	}
}
