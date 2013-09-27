/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

/**
 * Java class for CoreResource complex type.
 */
public abstract class CoreResource  extends Resource{

    private String externalId;

    public CoreResource() {}

    public CoreResource(Builder builder) {
        super(builder);
        this.externalId = builder.externalId;
    }

    public abstract static class Builder<T> extends Resource.Builder<T> {
        protected String externalId; // NOSONAR - fields are needed in child classes

        public T setExternalId(String externalId) {
            this.externalId = externalId;
            return builder;
        }
    }

    /**
     * Gets the value of the externalId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExternalId() {
        return externalId;
    }
}
