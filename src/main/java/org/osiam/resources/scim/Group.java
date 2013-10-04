/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * Java class for Group complex type.
 * @see <a href="http://tools.ietf.org/html/draft-ietf-scim-core-schema-02#section-8">SCIM 02 Group definition</a>
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Group extends CoreResource{

    private String displayName;
    private Set<Member> members;

    /**
     * needed for json serializing
     */
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

    /**
     * Gets a Set of all Members of the actual Group.
     * A member can be a other group or a User. 
     * To decide please look at the getType of the member
     * @return a set of all members
     */
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

        /**
         * 
         * @param displayName the unique display name of the group
         */
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

        /**
         * set all or additional members of a Group. 
         * A member can be a group or a User
         * @param members
         * @return the builder itself
         */
        public Builder setMembers(Set<Member> members) {
            this.members = members;
            return this;
        }

        /**
         * Construct the {@link Group} with the parameters passed to this builder.
         *
         * @return An {@link Group} configured accordingly
         */
		public Group build(){
            return new Group(this);
        }
    }

}
