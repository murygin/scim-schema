package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.GroupRefType;

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
		
		public Builder setType(GroupRefType type){
			this.type = type;
			return this;
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
