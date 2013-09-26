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
public abstract class MultiValuedAttribute extends BasicMultiValuedAttribute{

	private String type;

	protected MultiValuedAttribute() {
		super();
    }
	
	protected MultiValuedAttribute(@SuppressWarnings("rawtypes") Builder builder) {
		super(builder);
		this.type = builder.type;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }   

    /**
     * The Builder class is used to construct instances of the {@link BasicMultiValuedAttribute}
     */
    public static abstract class Builder<T> extends BasicMultiValuedAttribute.Builder<T>{
  	
    	protected String type;

    	protected Builder(){    		
    	}
    	
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link MultiValuedAttribute} to be changed or copied
		 */
    	protected Builder(MultiValuedAttribute old){
    		super(old);
    		this.type = old.type;
    	}
    	
        public T setType(String type) {
            this.type = type;
            return builder;
        }
    }
}
