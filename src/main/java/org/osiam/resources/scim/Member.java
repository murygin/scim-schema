/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.MemberType;

/**
 * Java class for members of a group which can be a group or a user.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Member{ // NOSONAR - Builder constructs instances of this class
	private MemberType type;
    private String value;
    private String operation;
    private String display;
	
    /**
     * needed for json serializing
     */
    private Member(){    }
    
	private Member(Builder builder) {
		this.value = builder.value;
		this.operation = builder.operation;
	}
	
    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }
	
    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link MemberType }
     *
     */
    public MemberType getType() {
        return type; //TODO SONAR: to be seen how the server will fill this field (reflection or setter)
    }  
    
    /**
     * Gets the value of the operation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperation() {
        return operation;
    }
	
    /**
     * Gets the displayName (Group) or userName (User) from the Member
     * @return possible object is
     *     {@link String }
     */
    public String getDisplay() {
        return display;//TODO SONAR: to be seen how the server will fill this field (reflection or setter)
    }
    
    /**
     * The Builder class is used to construct instances of the {@link Member}
     */
	public static class Builder{

        private String value;
        private String operation;
        
        public Builder(){
        }
        
        /**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Member} to be changed or copied
		 */
        public Builder(Member old){
        	this.value = old.value;
        	this.operation = old.operation;
        }
        
        /**
         * 
         * @param value the id from the User or the Group which is a member of the group
         * @return the builder itself
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }
        
        /**
         * 
         * @param value the Group which is a member of the group
         * @return the builder itself
         */
        public Builder setValue(Group value) {
            return setValue(value.getId());
        }
        
        /**
         * 
         * @param value the User which is a member of the group
         * @return the builder itself
         */
        public Builder setValue(User value) {
            return setValue(value.getId());
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
