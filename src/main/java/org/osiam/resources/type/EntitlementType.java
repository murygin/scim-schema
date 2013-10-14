package org.osiam.resources.type;

public class EntitlementType implements GenericType<EntitlementType>{

	private String type;
	public EntitlementType(String type){
		this.type = type;
	}
	
	@Override
	public EntitlementType fromString(String type) {
		return new EntitlementType(type);
	}
	
	@Override
	public String toString(){
		return type;
	}

	@Override
	public boolean equals( Object o )
	{
	  if ( o == null )
	    return false;

	  if ( o == this )
	    return true;

	  EntitlementType that = (EntitlementType) o;

	  return    this.type == that.type;
	}
	
	 @Override 
	 public int hashCode()
	 {
		 return type.hashCode();
	 }
}
