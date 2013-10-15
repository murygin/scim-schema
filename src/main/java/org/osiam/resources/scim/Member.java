/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.MemberType;

/**
 * Java class for members of a group which can be a group or a user.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) // NOSONAR - Builder constructs instances of this class
public class Member extends MultiValuedAttributeWithTypeField<MemberType>{ // NOSONAR - Builder constructs instances of this class
	
    /**
     * needed for json serializing
     */
    private Member(){    }
    
	private Member(Builder builder) {
		super(builder);
	}
    
    /**
     * The Builder class is used to construct instances of the {@link Member}
     */
	public static class Builder extends MultiValuedAttributeWithTypeField.Builder<Member.Builder, MemberType>{
        
        public Builder(){
			setBuilder(this);
        }
        
        /**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Member} to be changed or copied
		 */
        public Builder(Member old){
			super(old);
			setBuilder(this);
        }
        
		public Member build() {
            return new Member(this);
        }
		
        /**
         * Construct the {@link Member} with the parameters passed to this builder.
         *
         * @return An {@link Member} configured accordingly
         */
        public Builder setOperation(String operation) {
            this.operation = operation;
            return this;
        }
    }

}
