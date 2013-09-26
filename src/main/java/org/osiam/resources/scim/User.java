/*
 * Copyright (C) 2013 tarent AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.osiam.resources.scim;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>Java class for User complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class User extends CoreResource {

    private String userName;
    private Name name;
    private String displayName;
    private String nickName;
    private String profileUrl;
    private String title;
    private String userType;
    private String preferredLanguage;
    private String locale;
    private String timezone;
    private Boolean active;
    private String password;
    private List<Email> emails;
    private List<PhoneNumber> phoneNumbers;
    private List<Ims> ims;
    private List<Photo> photos;
    private List<Address> addresses;
    private List<GroupRef> groups;
    private List<Entitlement> entitlements;
    private List<Role> roles;
    private List<X509Certificate> x509Certificates;

    public User() {
    }

    private User(Builder builder) {
        super(builder);
        this.userName = builder.userName;
        this.name = builder.name;
        this.displayName = builder.displayName;
        this.nickName = builder.nickName;
        this.profileUrl = builder.profileUrl;
        this.title = builder.title;
        this.userType = builder.userType;
        this.preferredLanguage = builder.preferredLanguage;
        this.locale = builder.locale;
        this.timezone = builder.timezone;
        this.active = builder.active;
        this.password = builder.password;

        this.emails = builder.emails;
        this.phoneNumbers = builder.phoneNumbers;
        this.ims = builder.ims;
        this.photos = builder.photos;
        this.addresses = builder.addresses;
        this.groups = builder.groups;
        this.entitlements = builder.entitlements;
        this.roles = builder.roles;
        this.x509Certificates = builder.x509Certificates;
    }

    /**
     * Gets the value of the userName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link Name }
     */
    public Name getName() {
        return name;
    }

    /**
     * Gets the value of the displayName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Gets the value of the nickName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Gets the value of the profileUrl property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Gets the value of the title property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the value of the userType property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Gets the value of the preferredLanguage property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Gets the value of the locale property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Gets the value of the timezone property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Gets the value of the active property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Gets the value of the password property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPassword() {
        return password;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<Ims> getIms() {
        return ims;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public List<GroupRef> getGroups() {
        return groups;
    }

    public List<Entitlement> getEntitlements() {
        return entitlements;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public List<X509Certificate> getX509Certificates() {
        return x509Certificates;
    }

    /**
     * The Builder class is used to construct instances of the {@link User}
     */
    public static class Builder extends CoreResource.Builder<User.Builder> {
        private final String userName;
        private String password;
        private Boolean active;
        private String timezone;
        private String locale;
        private String preferredLanguage;
        private String userType;
        private String title;
        private String profileUrl;
        private String nickName;
        private String displayName;
        private Name name;
        private List<Email> emails = new ArrayList<>();
        private List<PhoneNumber> phoneNumbers = new ArrayList<>();
        private List<Ims> ims = new ArrayList<>();
        private List<Photo> photos = new ArrayList<>();
        private List<Address> addresses = new ArrayList<>();
        private List<GroupRef> groups = new ArrayList<>();
        private List<Entitlement> entitlements = new ArrayList<>();
        private List<Role> roles = new ArrayList<>();
        private List<X509Certificate> x509Certificates = new ArrayList<>();


        public Builder(String userName) {
            if (userName == null) { throw new IllegalArgumentException("userName must not be null."); }
            this.userName = userName;
            setBuilder(this);
        }

        public Builder() {
            this.userName = null;
            setBuilder(this);
        }

        /**
         * This class is for generating the output of an User. It does not copy the password and it checks for empty
         * lists; if a list is empty it will be nulled so that json-mapping will ignore it.
         *
         * @param user
         * @return new (filtered) {@link User} object
         */
        public static User generateForOutput(User user) {
            if (user == null) {
                return null;
            }
            Builder builder = new Builder(user.userName);
            builder.id = user.getId();
            builder.meta = user.getMeta();
            builder.externalId = user.getExternalId();
            builder.name = user.name;
            builder.displayName = user.displayName;
            builder.nickName = user.nickName;
            builder.profileUrl = user.profileUrl;
            builder.title = user.title;
            builder.userType = user.userType;
            builder.preferredLanguage = user.preferredLanguage;
            builder.locale = user.locale;
            builder.timezone = user.timezone;
            builder.active = user.active;
            // null lists when empty
            builder.emails = user.emails;
            builder.phoneNumbers = user.phoneNumbers;
            builder.ims = user.ims;
            builder.photos = user.photos;
            builder.addresses =user.addresses;
            builder.groups = user.groups;
            builder.entitlements = user.entitlements ;
            builder.roles = user.roles;
            builder.x509Certificates = user.x509Certificates;
            builder.schemas = user.getSchemas();
            return builder.build();
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public Builder setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder setPreferredLanguage(String preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            return this;
        }

        public Builder setLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setActive(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmails(List<Email> emails) {
            this.emails = emails;
            return this;
        }

        public Builder setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder setIms(List<Ims> ims) {
            this.ims = ims;
            return this;
        }

        public Builder setPhotos(List<Photo> photos) {
            this.photos = photos;
            return this;
        }

        public Builder setAddresses(List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder setGroups(List<GroupRef> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setEntitlements(List<Entitlement> entitlements) {
            this.entitlements = entitlements;
            return this;
        }

        public Builder setRoles(List<Role> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setX509Certificates(List<X509Certificate> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }

        /**
         * Construct the {@link User} with the parameters passed to this builder.
         *
         * @return An {@link User} configured accordingly
         */
        public User build() {
            return new User(this);
        }
    }
}
