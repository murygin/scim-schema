/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.osiam.resources.type.GenericType;

/**
 * Java class for multiValuedAttribute complex type.
 */
public abstract class MultiValuedAttributeWithTypeField<E extends GenericType<E>> extends MultiValuedAttributeBasicFields {

	protected E type;
	
	public E getType() {
		return type;
	}

	protected MultiValuedAttributeWithTypeField() {
		super();
	}

	protected MultiValuedAttributeWithTypeField(@SuppressWarnings("rawtypes") Builder builder) {
		super(builder);
		this.type = (E) builder.type;
	}

	/**
	 * The Builder class is used to construct instances of the
	 * {@link MultiValuedAttributeBasicFields}
	 */
	public abstract static class Builder<T,E extends GenericType<E>> extends
			MultiValuedAttributeBasicFields.Builder<T> {

		protected E type;
		
		protected Builder() {
		}

		/**
		 * copies all attributes to the new Builder to be able to change one
		 * attribute
		 * 
		 * @param old
		 *            old {@link MultiValuedAttributeWithTypeField} to be changed or copied
		 */
		protected Builder(MultiValuedAttributeWithTypeField<E> old) {
			super(old);
			this.type = old.type;
		}

        /**
         * sets the attribute to the builder
         * @param type the wanted type
         * @return the builder itself
         */
		public T setType(E type){
			this.type = type;
			return builder;
		}
	}
}