/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Java class for X509Certificate complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class X509Certificate extends MultiValuedAttribute{

    /**
     * needed for json serializing
     */
	private X509Certificate() { 	}
	
	private X509Certificate(Builder builder) {
		super(builder);
	}
	
    /**
     * The Builder class is used to construct instances of the {@link X509Certificate}
     */
	public static class Builder extends MultiValuedAttribute.Builder<X509Certificate.Builder>{

		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link X509Certificate} to be changed or copied
		 */
		public Builder(X509Certificate old){
			super(old);
			setBuilder(this);
		}
		
        /**
         * Construct the {@link X509Certificate} with the parameters passed to this builder.
         *
         * @return An {@link X509Certificate} configured accordingly
         */
        public X509Certificate build() {
            return new X509Certificate(this);
        }
    }

}
