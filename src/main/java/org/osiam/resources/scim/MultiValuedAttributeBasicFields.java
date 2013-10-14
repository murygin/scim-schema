/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;


/**
 * Java class for multiValuedAttribute complex type.
 */
public abstract class MultiValuedAttributeBasicFields {

    protected String value;      // NOSONAR - false-positive from clover; visibility can't be private
    protected String display;    // NOSONAR - false-positive from clover; visibility can't be private
    protected String operation;  // NOSONAR - false-positive from clover; visibility can't be private

    protected MultiValuedAttributeBasicFields() {    }
    
    protected MultiValuedAttributeBasicFields(@SuppressWarnings("rawtypes") Builder builder) {
        this.value = builder.value;
        this.operation = builder.operation;
        this.display = builder.display;
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

    public abstract static class Builder<T>{

    	protected String value;      // NOSONAR - false-positive from clover; visibility can't be private
        protected String operation;  // NOSONAR - false-positive from clover; visibility can't be private
        protected T builder;         // NOSONAR - false-positive from clover; visibility can't be private
        private String display; //TODO SONAR: has to be seen how the server will fill this field, with reflection or a setter
        
        protected void setBuilder(T self){
        	this.builder = self;
        }
        
        protected Builder(){
        }
        
        protected Builder(MultiValuedAttributeBasicFields old){
        	this.value = old.value;
        	this.operation = old.operation;
        }
        
        public T setValue(String value) {
            this.value = value;
            return builder;
        }

        public T setOperation(String operation) {
            this.operation = operation;
            return builder;
        }
    }
}
