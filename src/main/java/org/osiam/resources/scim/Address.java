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

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.AddressTypeSerializer;

/**
 * Java class for address complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Address {

    private String formatted;
    private String streetAddress;
    private String locality;
    private String region;
    private String postalCode;
    private String country;
    private String operation;
    private Type type;

    public Address() {
    }

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
     *     {@link String }
     *
     */
    public Type getType() {
        return type;
    }
    
    public static class Builder {

        private String formatted;
        private String streetAddress;
        private String locality;
        private String region;
        private String postalCode;
        private String country;
        private String operation;
        private Type type;

        public Builder(){
        }
        
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

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setLocality(String locality) {
            this.locality = locality;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = region;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        
        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public Address build() {
            return new Address(this);
        }

    }
    
    @JsonSerialize(using = AddressTypeSerializer.class)
    public enum Type{
    	WORK ("work"),
    	HOME ("home"),
    	OTHER ("other")
    	;
    	
    	String value = "";
    	
    	Type(String value){
    		this.value = value;
    	}
    }
}
