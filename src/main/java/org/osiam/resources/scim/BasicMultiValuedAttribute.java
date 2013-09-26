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


/**
 * Java class for multiValuedAttribute complex type.
 */
public abstract class BasicMultiValuedAttribute {

    protected String value;
    protected String display;
    protected Boolean primary;
    protected String operation;

    protected BasicMultiValuedAttribute() {    }
    
    protected BasicMultiValuedAttribute(@SuppressWarnings("rawtypes") Builder builder) {
        this.value = builder.value;
        this.primary = builder.primary;
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
     * Gets the value of the display property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Gets the value of the primary property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPrimary() {
        return primary;
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

    public static abstract class Builder<T>{

    	protected String value;
        protected Boolean primary;
        protected String operation;
        protected T builder;
        
        protected void setBuilder(T self){
        	this.builder = self;
        }
        
        protected Builder(){
        }
        
        protected Builder(BasicMultiValuedAttribute old){
        	this.value = old.value;
        	this.primary = old.primary;
        	this.operation = old.operation;
        }
        
        public T setValue(String value) {
            this.value = value;
            return builder;
        }

        public T setPrimary(Boolean primary) {
            this.primary = primary;
            return builder;
        }

        public T setOperation(String operation) {
            this.operation = operation;
            return builder;
        }
    }
}
