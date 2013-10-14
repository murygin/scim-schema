/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;


/**
 * Java class for multiValuedAttribute complex type.
 */
public abstract class MultiValuedAttributeWithPrimaryField 
	extends MultiValuedAttributeBasicFields implements PrimaryMultiValuedAttribute{

	private Boolean primary;

	protected MultiValuedAttributeWithPrimaryField() {
		super();
	}

	protected MultiValuedAttributeWithPrimaryField(@SuppressWarnings("rawtypes") Builder builder) {
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
	public abstract static class Builder<T> extends
			MultiValuedAttributeBasicFields.Builder<T> implements PrimaryMultiValuedAttribute.Builder<T>{

		protected Boolean primary;   // NOSONAR - false-positive from clover; visibility can't be private
		
		protected Builder() {
		}

		/**
		 * copies all attributes to the new Builder to be able to change one
		 * attribute
		 * 
		 * @param old
		 *            old {@link MultiValuedAttributeWithPrimaryField} to be changed or copied
		 */
		protected Builder(MultiValuedAttributeWithPrimaryField old) {
			super(old);
        	this.primary = old.primary;
		}

        public T setPrimary(Boolean primary) {
            this.primary = primary;
            return builder;
        }
	}
}