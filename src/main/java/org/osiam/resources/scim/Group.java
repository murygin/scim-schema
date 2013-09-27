/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * Java class for Group complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Group extends CoreResource{

    private String displayName;
    private Set<Member> members;

    //JSON Serializing
    public Group(){}


    public Group(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.members = builder.members;
    }

    /**
     * Gets the value of the displayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayName() {
        return displayName;
    }

    public Set<Member> getMembers() {
        return members;
    }
    
    /**
     * The Builder class is used to construct instances of the {@link Group}
     */
    public static class Builder extends CoreResource.Builder<Group.Builder>{

        private String displayName;
        private Set<Member> members = new HashSet<>();

        public Builder(){
        	setBuilder(this);
        }

        public Builder(String displayName) {
        	this.displayName = displayName;
        	setBuilder(this);
        }

        /**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Group} to be changed or copied
		 */
        public Builder(Group group) {
            id = group.getId();
            meta = group.getMeta();
            externalId = group.getExternalId();
            displayName = group.displayName;
            members = group.members;
        }

        public Builder setMembers(Set<Member> members) {
            this.members = members;
            return this;
        }

		public Group build(){
            return new Group(this);
        }
    }

}
