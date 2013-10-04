/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import java.util.Set;

/**
 * Java class for Resource complex type.
 */
public abstract class Resource {

    private String id;
    private Meta meta;
    private Set<String> schemas;

    /**
     * needed for json serializing
     */
    protected Resource(){}

    protected Resource(Builder builder) {
        this.id = builder.id;
        this.meta = builder.meta;
        this.schemas = builder.schemas;
    }

    /**
     * The Builder class is used to construct instances of the {@link Resource}
     */
    public abstract static class Builder<T> {
        protected String id; // NOSONAR - fields are needed in child classes
        protected Meta meta; // NOSONAR - fields are needed in child classes
        protected Set<String> schemas = Constants.CORE_SCHEMAS; // NOSONAR - fields are needed in child classes
        protected T builder;
        
        protected void setBuilder(T self){
        	this.builder = self;
        }
        
        public T setSchemas(Set<String> schemas) {
            this.schemas = schemas;
            return builder;
        }

        public T setId(String id) {
            this.id = id;
            return builder;
        }

        public T setMeta(Meta meta) {
            this.meta = meta;
            return builder;
        }
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the value of the meta property.
     *
     * @return possible object is
     *         {@link Meta }
     */
    public Meta getMeta() {
        return meta;
    }

    public Set<String> getSchemas() {
        return schemas;
    }
}
