/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Entitlement extends BasicMultiValuedAttribute{

	private String type;
	
	public Entitlement() {
	}
	
	private Entitlement(Builder builder) {
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
     * The Builder class is used to construct instances of the {@link Entitlement}
     */
	public static class Builder extends BasicMultiValuedAttribute.Builder<Entitlement.Builder>{

		protected String type;
		
		public Builder(){
			setBuilder(this);
		}
		
        /**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Entitlement} to be changed or copied
		 */
		public Builder(Entitlement old){
			super(old);
			setBuilder(this);
    		this.type = old.type;
		}
		
        /**
         * Construct the {@link Entitlement} with the parameters passed to this builder.
         *
         * @return An {@link Entitlement} configured accordingly
         */
        public Entitlement build() {
            return new Entitlement(this);
        }
        
        public Builder setType(String type) {
            this.type = type;
            return this;
        }
    }

}
