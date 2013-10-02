/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.EmailType;

/**
 * Java class for email complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Email extends BasicMultiValuedAttribute{

	private EmailType type;
	
	private Email() {
	}
	
	private Email(Builder builder) {
		super(builder);
		this.type = builder.type;
	}
	
    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link EmailType }
     *
     */
    public EmailType getType() {
        return type;
    }  
	
    /**
     * The Builder class is used to construct instances of the {@link Email}
     */
	public static class Builder extends BasicMultiValuedAttribute.Builder<Email.Builder>{

		private EmailType type;
		
		public Builder(){
			setBuilder(this);
		}
		
        /**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Email} to be changed or copied
		 */
		public Builder (Email old){
			super(old);
			this.type = old.type;
			setBuilder(this);
		}
		
        /**
         * sets the attribute to the builder
         * @param type the wanted type
         * @return the builder itself
         */
		public Builder setType(EmailType type){
			this.type = type;
			return this;
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
