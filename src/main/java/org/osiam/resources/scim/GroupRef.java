/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.GroupRefType;

/**
 * Java class for Reference of a Group where a User is member of.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) // NOSONAR - Builder constructs instances of this class
public class GroupRef extends MultiValuedAttributeWithTypeField<GroupRefType>{ // NOSONAR - Builder constructs instances of this class

    /**
     * needed for json serializing
     */
	private GroupRef() {	}
	
	private GroupRef(Builder builder) {
		super(builder);
		this.type = builder.type;
	} 
	
    /**
     * The Builder class is used to construct instances of the {@link GroupRef}
     */
	public static class Builder extends MultiValuedAttributeWithTypeField.Builder<GroupRef.Builder, GroupRefType>{
		
		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link GroupRef} to be changed or copied
		 */
		public Builder (GroupRef old){
			super(old);
			setBuilder(this);
		}
		
        /**
         * Construct the {@link GroupRef} with the parameters passed to this builder.
         *
         * @return An {@link GroupRef} configured accordingly
         */
        public GroupRef build() {
            return new GroupRef(this);
        }
    }

}
