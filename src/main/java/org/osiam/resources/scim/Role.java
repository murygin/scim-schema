package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Role extends MultiValuedAttribute{

	private Role() {
	}
	
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
