/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

/**
 * Java class for manager complex type.
 */
public class Manager {

    private final String managerId;
    private final String displayName;

    public Manager(String managerId, String displayName) {
        this.managerId = managerId;
        this.displayName = displayName;
    }

    /**
     * Gets the value of the managerId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Gets the value of the displayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayName() {
        return displayName;
    }

}