/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.AddressType;

/**
 * Java class for address complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) // NOSONAR - Builder constructs instances of this class
public class Address {                                     // NOSONAR - Builder constructs instances of this class

    private String formatted;
    private String streetAddress;
    private String locality;
    private String region;
    private String postalCode;
    private String country;
    private String operation;
    private AddressType type;

    /**
     * needed for json serializing
     */
    private Address() {    }

    private Address(Builder builder) {
        this.formatted = builder.formatted;
        this.streetAddress = builder.streetAddress;
        this.locality = builder.locality;
        this.region = builder.region;
        this.postalCode = builder.postalCode;
        this.country = builder.country;
        this.operation = builder.operation;
        this.type = builder.type;
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
     * Gets the value of the streetAddress property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Gets the value of the locality property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Gets the value of the region property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getRegion() {
        return region;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Gets the value of the country property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCountry() {
        return country;
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
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link AddressType }
     *
     */
    public AddressType getType() {
        return type;
    }
    
    /**
     * The Builder class is used to construct instances of the {@link Address}
     */
    public static class Builder {

        private String formatted;
        private String streetAddress;
        private String locality;
        private String region;
        private String postalCode;
        private String country;
        private String operation;
        private AddressType type;

        public Builder(){
        }
        
        /**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param oldAddress old {@link Address} to be changed or copied
		 */
        public Builder(Address oldAddress){
        	this.formatted = oldAddress.formatted;
        	this.streetAddress = oldAddress.streetAddress;
        	this.locality = oldAddress.locality;
        	this.region = oldAddress.region;
        	this.postalCode = oldAddress.postalCode;
        	this.country = oldAddress.country;
        	this.operation = oldAddress.operation;
        	this.type = oldAddress.type;
        }
        public Builder setFormatted(String formatted) {
            this.formatted = formatted;
            return this;
        }

        /**
         * sets the attribute to the builder
         * @param streetAddress the wanted streetAddress
         * @return the builder itself
         */
        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        /**
         * sets the attribute to the builder
         * @param locality the wanted locality
         * @return the builder itself
         */
        public Builder setLocality(String locality) {
            this.locality = locality;
            return this;
        }

        /**
         * sets the attribute to the builder
         * @param region the wanted region
         * @return the builder itself
         */
        public Builder setRegion(String region) {
            this.region = region;
            return this;
        }

        /**
         * sets the attribute to the builder
         * @param postalCode the wanted postalCode
         * @return the builder itself
         */
        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * sets the attribute to the builder
         * @param country the wanted country
         * @return the builder itself
         */
        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        /**
         * sets the attribute to the builder
         * @param operation the wanted operation
         * @return the builder itself
         */
        public Builder setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        
        /**
         * sets the attribute to the builder
         * @param type the wanted type
         * @return the builder itself
         */
        public Builder setType(AddressType type) {
            this.type = type;
            return this;
        }

        /**
         * Construct the {@link Address} with the parameters passed to this builder.
         *
         * @return An {@link Address} configured accordingly
         */
        public Address build() {
            return new Address(this);
        }
    }
    
}
