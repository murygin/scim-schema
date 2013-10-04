/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * Java class for name complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Name {

    private String formatted;
    private String familyName;
    private String givenName;
    private String middleName;
    private String honorificPrefix;
    private String honorificSuffix;

    /**
     * needed for json serializing
     */
    private Name() {}

    private Name(Builder builder) {
        this.formatted = builder.formatted;
        this.familyName = builder.familyName;
        this.givenName = builder.givenName;
        this.middleName = builder.middleName;
        this.honorificPrefix = builder.honorificPrefix;
        this.honorificSuffix = builder.honorificSuffix;

    }

    /**
     * Gets the value of the formatted property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFormatted() {
        return formatted;
    }

    /**
     * Gets the value of the familyName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Gets the value of the givenName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Gets the value of the middleName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Gets the value of the honorificPrefix property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getHonorificPrefix() {
        return honorificPrefix;
    }


    /**
     * Gets the value of the honorificSuffix property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getHonorificSuffix() {
        return honorificSuffix;
    }
    
    /**
     * The Builder class is used to construct instances of the {@link Name}
     */
    public static class Builder {
        private String formatted;
        private String familyName;
        private String givenName;
        private String middleName;
        private String honorificPrefix;
        private String honorificSuffix;

        public Builder(){
        }
        
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Name} to be changed or copied
		 */
        public Builder(Name old){
        	this.formatted = old.formatted;
        	this.familyName = old.familyName;
        	this.givenName = old.givenName;
        	this.middleName = old.middleName;
        	this.honorificPrefix = old.honorificPrefix;
        	this.honorificSuffix = old.honorificSuffix;
        }
        
        /**
         * sets the name as formatted String to the builder
         * @param formatted the wanted type
         * @return the builder itself
         */
        public Builder setFormatted(String formatted) {
            this.formatted = formatted;
            return this;
        }

        /**
         * sets the familyName to the builder
         * @param familyName the familyName of the User
         * @return the builder itself
         */
        public Builder setFamilyName(String familyName) {
            this.familyName = familyName;
            return this;
        }

        /**
         * sets the givenName to the builder
         * @param givenName the first Name of the User
         * @return the builder itself
         */
        public Builder setGivenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        /**
         * sets the middleName to the builder
         * @param middleName the middleName of the User
         * @return the builder itself
         */
        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        /**
         * sets the honorific Prefix to the builder
         * @param honorificPrefix the honorific Prefix of the User
         * @return the builder itself
         */
        public Builder setHonorificPrefix(String honorificPrefix) {
            this.honorificPrefix = honorificPrefix;
            return this;
        }

        /**
         * sets the honorific Suffix to the builder
         * @param honorificSuffix the honorific Suffix of the User
         * @return the builder itself
         */
        public Builder setHonorificSuffix(String honorificSuffix) {
            this.honorificSuffix = honorificSuffix;
            return this;
        }

        /**
         * Construct the {@link Name} with the parameters passed to this builder.
         *
         * @return An {@link Name} configured accordingly
         */
        public Name build() {
            return new Name(this);
        }
    }

}
