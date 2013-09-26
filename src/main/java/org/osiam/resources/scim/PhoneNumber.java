package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.PhoneNumberType;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class PhoneNumber extends BasicMultiValuedAttribute{

	private PhoneNumberType type;
	
	public PhoneNumber(){
	}
	
	private PhoneNumber(Builder builder) {
		super(builder);
		this.type = builder.type;
	}
	
    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link PhoneNumberType }
     *
     */
    public PhoneNumberType getType() {
        return type;
    }  
	
    /**
     * The Builder class is used to construct instances of the {@link PhoneNumber}
     */
	public static class Builder extends BasicMultiValuedAttribute.Builder<PhoneNumber.Builder>{

		private PhoneNumberType type;
		
		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link PhoneNumber} to be changed or copied
		 */
		public Builder(PhoneNumber old){
			super(old);
			this.type = old.type;
			setBuilder(this);
		}
		
		public Builder setType(PhoneNumberType type){
			this.type = type;
			return this;
		}
		
        /**
         * Construct the {@link PhoneNumber} with the parameters passed to this builder.
         *
         * @return An {@link PhoneNumber} configured accordingly
         */
        public PhoneNumber build() {
            return new PhoneNumber(this);
        }
    }

}
