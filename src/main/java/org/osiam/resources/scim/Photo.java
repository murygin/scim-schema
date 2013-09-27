/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.PhotoType;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Photo extends BasicMultiValuedAttribute{

	private PhotoType type;
	
	private Photo() {
	}
	
	private Photo(Builder builder) {
		super(builder);
		this.type = builder.type;
	}
	
    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link PhotoType }
     *
     */
    public PhotoType getType() {
        return type;
    }  
	
    /**
     * The Builder class is used to construct instances of the {@link Photo}
     */
	public static class Builder extends BasicMultiValuedAttribute.Builder<Photo.Builder>{

		private PhotoType type;
		
		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Photo} to be changed or copied
		 */
		public Builder(Photo old){
			super(old);
			this.type = old.type;
			setBuilder(this);
		}
		
		public Builder setType(PhotoType type){
			this.type = type;
			return this;
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
