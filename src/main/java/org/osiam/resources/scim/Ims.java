/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.ImsType;

/**
 * Java class for ims complex type.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) // NOSONAR - Builder constructs instances of this class
public class Ims extends MultiValuedAttributeAllFields<ImsType>{           // NOSONAR - Builder constructs instances of this class

    /**
     * needed for json serializing
     */
	private Ims(){	}
	
	private Ims(Builder builder) {
		super(builder);
		this.type = builder.type;
	}
	
    /**
     * The Builder class is used to construct instances of the {@link Ims}
     */
	public static class Builder extends MultiValuedAttributeAllFields.Builder<Ims.Builder, ImsType>{

		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Ims} to be changed or copied
		 */
		public Builder (Ims old){
			super(old);
			setBuilder(this);
		}
		
        /**
         * Construct the {@link Ims} with the parameters passed to this builder.
         *
         * @return An {@link Ims} configured accordingly
         */
        public Ims build() {
            return new Ims(this);
        }
    }

}
