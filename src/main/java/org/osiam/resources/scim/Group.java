/*
 * Copyright (C) 2013 tarent AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
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
