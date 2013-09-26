package org.osiam.resources.scim;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.type.ImsType;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Ims extends BasicMultiValuedAttribute{

	private ImsType type;
	
	public Ims(){
	}
	
	private Ims(Builder builder) {
		super(builder);
		this.type = builder.type;
	}
	
    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link ImsType }
     *
     */
    public ImsType getType() {
        return type;
    }  
	
    /**
     * The Builder class is used to construct instances of the {@link Ims}
     */
	public static class Builder extends BasicMultiValuedAttribute.Builder<Ims.Builder>{

		private ImsType type;
		
		public Builder(){
			setBuilder(this);
		}
		
		/**
		 * copies all attributes to the new Builder to be able to change one attribute
		 * @param old old {@link Ims} to be changed or copied
		 */
		public Builder (Ims old){
			super(old);
			this.type = old.type;
			setBuilder(this);
		}
		
		public Builder setType(ImsType type){
			this.type = type;
			return this;
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
