/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.PhotoType;

/**
 * Java class for a url address of a photo.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) // NOSONAR - Builder constructs instances of this class
public class Photo extends MultiValuedAttributeAllFields<PhotoType>{          // NOSONAR - Builder constructs instances of this class

    /**
     * needed for json serializing
     */
	private Photo() {	}
	
	private Photo(Builder builder) {
		super(builder);
	}
	
    /**
     * The Builder class is used to construct instances of the {@link Photo}
     */
	public static class Builder extends MultiValuedAttributeAllFields.Builder<Photo.Builder, PhotoType>{

		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Photo} to be changed or copied
		 */
		public Builder(Photo old){
			super(old);
			setBuilder(this);
		}
		
        /**
         * Construct the {@link Photo} with the parameters passed to this builder.
         *
         * @return An {@link Photo} configured accordingly
         */
        public Photo build() {
            return new Photo(this);
        }
    }

}
