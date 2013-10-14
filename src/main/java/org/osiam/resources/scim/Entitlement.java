/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.EntitlementType;

/**
 * Java class for Entitlement complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) // NOSONAR - Builder constructs instances of this class
public class Entitlement extends MultiValuedAttributeAllFields<EntitlementType>{   // NOSONAR - Builder constructs instances of this class
	
    /**
     * needed for json serializing
     */
	private Entitlement() {	}
	
	private Entitlement(Builder builder) {
		super(builder);
	}
	
    /**
     * The Builder class is used to construct instances of the {@link Entitlement}
     */
	public static class Builder extends MultiValuedAttributeAllFields.Builder<Entitlement.Builder, EntitlementType>{
		
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
		}
		
        /**
         * Construct the {@link Entitlement} with the parameters passed to this builder.
         *
         * @return An {@link Entitlement} configured accordingly
         */
        public Entitlement build() {
            return new Entitlement(this);
        }
    }

}
