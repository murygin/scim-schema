/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.PhoneNumberType;

/**
 * Java class for phone number complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) // NOSONAR - Builder constructs instances of this class
public class PhoneNumber extends MultiValuedAttributeAllFields<PhoneNumberType>{   // NOSONAR - Builder constructs instances of this class

	private PhoneNumberType type;
	
    /**
     * needed for json serializing
     */
	private PhoneNumber(){	}
	
	private PhoneNumber(Builder builder) {
		super(builder);
		this.type = builder.type;
	}
	
    /**
     * The Builder class is used to construct instances of the {@link PhoneNumber}
     */
	public static class Builder extends MultiValuedAttributeAllFields.Builder<PhoneNumber.Builder, PhoneNumberType>{

		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link PhoneNumber} to be changed or copied
		 */
		public Builder(PhoneNumber old){
			super(old);
			setBuilder(this);
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
