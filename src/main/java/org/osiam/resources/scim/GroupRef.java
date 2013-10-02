/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.GroupRefType;

/**
 * Java class for Reference of a Group where a User is member of.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class GroupRef extends BasicMultiValuedAttribute{

	private GroupRefType type;
	
	private GroupRef() {
	}
	
	private GroupRef(Builder builder) {
		super(builder);
		this.type = builder.type;
	}
	
    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link GroupRefType }
     *
     */
    public GroupRefType getType() {
        return type;
    }  
	
    /**
     * The Builder class is used to construct instances of the {@link GroupRef}
     */
	public static class Builder extends BasicMultiValuedAttribute.Builder<GroupRef.Builder>{

		private GroupRefType type;
		
		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link GroupRef} to be changed or copied
		 */
		public Builder (GroupRef old){
			super(old);
			this.type = old.type;
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
