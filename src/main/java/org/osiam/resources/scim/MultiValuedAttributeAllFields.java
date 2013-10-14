/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.osiam.resources.type.GenericType;

/**
 * Java class for multiValuedAttribute complex type.
 */
public abstract class MultiValuedAttributeAllFields<E extends GenericType<E>> 
			extends MultiValuedAttributeWithTypeField<E> implements PrimaryMultiValuedAttribute {

	protected Boolean primary;

	protected MultiValuedAttributeAllFields() {
		super();
	}

	protected MultiValuedAttributeAllFields(@SuppressWarnings("rawtypes") Builder builder) {
		super(builder);
		this.primary = builder.primary;
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
	 * The Builder class is used to construct instances of the
	 * {@link MultiValuedAttributeBasicFields}
	 */
	public abstract static class Builder<T,E extends GenericType<E>> extends
			MultiValuedAttributeWithTypeField.Builder<T, E> implements PrimaryMultiValuedAttribute.Builder<T>{

		protected Boolean primary;   // NOSONAR - false-positive from clover; visibility can't be private
		
		protected Builder() {
		}

		/**
		 * copies all attributes to the new Builder to be able to change one
		 * attribute
		 * 
		 * @param old
		 *            old {@link MultiValuedAttributeAllFields} to be changed or copied
		 */
		protected Builder(MultiValuedAttributeAllFields<E> old) {
			super(old);
        	this.primary = old.primary;
		}

        public T setPrimary(Boolean primary) {
            this.primary = primary;
            return builder;
        }
	}
}