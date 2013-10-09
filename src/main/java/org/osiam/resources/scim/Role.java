/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Java class for role complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Role extends MultiValuedAttribute{ // NOSONAR - Builder constructs instances of this class

    /**
     * needed for json serializing
     */
	private Role() { 	}
	
	private Role(Builder builder) {
		super(builder);
	}
	
    /**
     * The Builder class is used to construct instances of the {@link Role}
     */
	public static class Builder extends MultiValuedAttribute.Builder<Role.Builder>{

		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Role} to be changed or copied
		 */
		public Builder(Role old){
			super(old);
			setBuilder(this);
		}
		
        /**
         * Construct the {@link Role} with the parameters passed to this builder.
         *
         * @return An {@link Role} configured accordingly
         */
        public Role build() {
            return new Role(this);
        }
    }

}
