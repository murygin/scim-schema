/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.MemberType;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Member{
	private MemberType type;
    private String value;
    private String operation;
    private String display;
	
    public Member(){
    }
    
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
        return type;
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
	

    public String getDisplay() {
        return display;
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
        
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }
        
        public Builder setValue(Group value) {
            return setValue(value.getId());
        }
        
        public Builder setValue(User value) {
            return setValue(value.getId());
        }
        
		public Member build() {
            return new Member(this);
        }
		
        public Builder setOperation(String operation) {
            this.operation = operation;
            return this;
        }
    }

}
