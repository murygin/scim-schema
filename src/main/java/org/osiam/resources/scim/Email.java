/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.EmailType;

/**
 * Java class for email complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) // NOSONAR - Builder constructs instances of this class
public class Email extends MultiValuedAttributeAllFields<EmailType>{         // NOSONAR - Builder constructs instances of this class
	
    /**
     * needed for json serializing
     */
	private Email() {	}
	
	private Email(Builder builder) {
		super(builder);
		this.type = builder.type;
	}

    /**
     * The Builder class is used to construct instances of the {@link Email}
     */
	public static class Builder extends MultiValuedAttributeAllFields.Builder<Email.Builder, EmailType>{
		
		public Builder(){
			setBuilder(this);
		}
		
        /**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Email} to be changed or copied
		 */
		public Builder (Email old){
			super(old);
			setBuilder(this);
		}
	
		
        /**
         * Construct the {@link Email} with the parameters passed to this builder.
         *
         * @return An {@link Email} configured accordingly
         */
        public Email build() {
            return new Email(this);
        }
    }

}
