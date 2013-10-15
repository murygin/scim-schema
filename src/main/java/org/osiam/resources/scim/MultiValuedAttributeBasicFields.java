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
        protected String display; 	  // NOSONAR - false-positive from clover; visibility can't be private
        
        protected void setBuilder(T self){
        	this.builder = self;
        }
        
        protected Builder(){
        }
        
        protected Builder(MultiValuedAttributeBasicFields old){
        	this.value = old.value;
        	this.operation = old.operation;
        }
        
        /**
         * here you can set the value of the actual attribute like the emailaddress or the id of a member
         * @param value the actual value
         * @return the Builder itself
         */
        public T setValue(String value) {
            this.value = value;
            return builder;
        }

        /**
         * the wanted operation to be done. Actual "delete" is the only one supported
         * @param operation the wanted operation
         * @return the Builder itself
         */
        public T setOperation(String operation) {
            this.operation = operation;
            return builder;
        }
        
        /**
         * The set display method needs only be used by getting the attribute out of the database by the server.
         * If this method is used to set a value while creating a attribute it will be ignored by the OSIAM server
         * by saving it into the Database
         * @param value the display value of the actual attribute
         * @return the Builder itself
         */
        public T setDisplay(String value) {
            this.display = value;
            return builder;
        }
    }
}
