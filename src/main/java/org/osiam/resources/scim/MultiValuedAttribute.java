/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;




/**
 * Java class for multiValuedAttribute complex type.
 */
public abstract class MultiValuedAttribute extends BasicMultiValuedAttribute{

	private String type;

	protected MultiValuedAttribute() {
		super();
    }
	
	protected MultiValuedAttribute(@SuppressWarnings("rawtypes") Builder builder) {
		super(builder);
		this.type = builder.type;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }   

    /**
     * The Builder class is used to construct instances of the {@link BasicMultiValuedAttribute}
     */
    public static abstract class Builder<T> extends BasicMultiValuedAttribute.Builder<T>{
  	
    	protected String type;

    	protected Builder(){    		
    	}
    	
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link MultiValuedAttribute} to be changed or copied
		 */
    	protected Builder(MultiValuedAttribute old){
    		super(old);
    		this.type = old.type;
    	}
    	
        public T setType(String type) {
            this.type = type;
            return builder;
        }
    }
}
