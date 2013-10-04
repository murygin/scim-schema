/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonDateSerializer;


/**
 * Java class for meta complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Meta {

    @JsonSerialize(using=JsonDateSerializer.class)
    private Date created;
    @JsonSerialize(using=JsonDateSerializer.class)
    private Date lastModified;
    private String location;
    private String version;
    private Set<String> attributes;
    private String resourceType;

    /**
     * needed for json serializing
     */
    private Meta() { }


    private Meta(Builder builder) {
        this.created = builder.created;
        this.lastModified = builder.lastModified;
        this.attributes = builder.attributes;
        this.location = builder.location;
        this.version = builder.version;
        this.resourceType = builder.resourceType;
    }

    /**
     * Gets the value of the location property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocation() {
        return location;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        return version;
    }

    /**
     * the attributes in this Set will be removed from the OSIAM server while doing a PATCH operation
     * @return a Set of all Attributes
     */
    public Set<String> getAttributes() {
        return attributes;
    }

    /**
     * 
     * @return the date the resource was created
     */
    public Date getCreated() {
        if (created != null) {
            return new Date(created.getTime());
        }
        return null;
    }

    /**
     * 
     * @return the date the resource was last modified
     */
    public Date getLastModified() {
        if (lastModified != null) {
            return new Date(lastModified.getTime());
        }
        return null;
    }

    /**
     * 
     * @return the type of the resource
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The Builder class is used to construct instances of the {@link Meta}
     */
    public static class Builder{
        private final Date created;
        private final Date lastModified;
        private String location;
        private String version;
        private Set<String> attributes = new HashSet<>();
        private String resourceType;

        /**
         * Will set created, as well as lastModified to System.currentTime
         */
        public Builder(){
            this.created = new Date(System.currentTimeMillis());
            this.lastModified = new Date(System.currentTimeMillis());
        }

        /**
         * Will set created to given value and lastModified to System.currentTime
         */
        public Builder(Date created){
            this.created = created != null ? new Date(created.getTime()) : null;
            this.lastModified = new Date(System.currentTimeMillis());
        }

        /**
         * Will set created to given value and lastModified to System.currentTime
         */
        public Builder(Date created, Date lastModified){
            this.created = created != null ? new Date(created.getTime()) : null;
            this.lastModified = lastModified != null ? new Date(lastModified.getTime()) : null;
        }

        /**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Meta} to be changed or copied
		 */
        public Builder(Meta old){
        	if(old == null){
                this.created = null;
                this.lastModified = new Date(System.currentTimeMillis());
        	}else{
	        	this.created = old.created;
	        	this.lastModified = old.lastModified;
	        	
	        	this.location = old.location;
	        	this.version = old.version;
	        	this.attributes = old.attributes;
	        	this.resourceType = old.resourceType;
        	}
        }
        
        /**
         * sets the location to the builder
         * @param location the wanted location
         * @return the builder itself
         */
        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        /**
         * sets the version to the builder
         * @param version the actual version
         * @return the builder itself
         */
        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        /**
         * sets the resourceType to the builder
         * @param resourceType the actual resourceType
         * @return the builder itself
         */
        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * sets a list of attributes that need to be deleted while doing a PATCH operation
         * @param attributes all attributes to be deleted
         * @return the builder itself
         */
        public Builder setAttributes(Set<String> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Construct the {@link Meta} with the parameters passed to this builder.
         *
         * @return An {@link Meta} configured accordingly
         */
        public Meta build(){
            return new Meta(this);
        }
    }
}
