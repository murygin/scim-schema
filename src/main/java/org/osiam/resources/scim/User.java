/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>Java class for User complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * @see <a href="http://tools.ietf.org/html/draft-ietf-scim-core-schema-02#section-6">SCIM 02 User definition</a>
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

    /**
     * needed for json serializing
     */
    private User() {    }

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

        /**
         * to be used if a new User has to be created
         * @param userName the user Name of the user
         */
        public Builder(String userName) {
            if (userName == null) { throw new IllegalArgumentException("userName must not be null."); }
            this.userName = userName;
            setBuilder(this);
        }

        /**
         * can be used if a update object has to be created an the userName of the user stays the same.
         */
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

        /**
         * sets the name to the builder
         * @param name the components of the User's real name
         * @return the builder itself
         */
        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        /**
         * sets the displayName to the builder
         * @param displayName the name of the User, suitable for display to end-users
         * @return the builder itself
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * sets the nickName to the builder
         * @param nickName the casual way to address the user in real life, e.g. "Bob" or "Bobby" instead of "Robert".
         * @return the builder itself
         */
        public Builder setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * sets the profileUrl to the builder
         * @param profileUrl a fully qualified URL to a page representing the User's online profile
         * @return the builder itself
         */
        public Builder setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
            return this;
        }

        /**
         * sets the title to the builder
         * @param title the user's title, such as "Vice President"
         * @return the builder itself
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * sets the userType to the builder
         * @param userType used to identify the organization to user relationship.
      	 * Typical values used might be "Contractor", "Employee", "Intern",
         * "Temp", "External", and "Unknown" but any value may be used.
         * @return the builder itself
         */
        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        /**
         * sets the preferredLanguage to the builder
         * @param preferredLanguage indicates the User's preferred written or spoken language
         * @return the builder itself
         */
        public Builder setPreferredLanguage(String preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            return this;
        }
        
        /**
         * sets the locale to the builder
         * @param locale Used to indicate the User's default location for purposes of
         * localizing items such as currency, date time format, numerical
         * representations, etc
         * @return the builder itself
         */
        public Builder setLocale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * sets the timezone to the builder
         * @param timezone The User's time zone in the "Olson" timezone database
         * format [19]; e.g.,'America/Los_Angeles'
         * @return the builder itself
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * sets the active to the builder
         * @param active a Boolean value indicating the User's administrative status
         * @return the builder itself
         */
        public Builder setActive(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * sets the password to the builder
         * This will NEVER be returned by the OSIAM server
         * @param password the User's clear text password
         * @return the builder itself
         */
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        /**
         * sets the emails to the builder
         * @param emails E-mail addresses for the User
         * @return the builder itself
         */
        public Builder setEmails(List<Email> emails) {
            this.emails = emails;
            return this;
        }

        /**
         * sets the phoneNumbers to the builder
         * @param phoneNumbers Phone numbers for the User
         * @return the builder itself
         */
        public Builder setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * sets the ims to the builder
         * @param ims Instant messaging address for the User
         * @return the builder itself
         */
        public Builder setIms(List<Ims> ims) {
            this.ims = ims;
            return this;
        }

        /**
         * sets the photos to the builder
         * @param photos The value SHOULD be a canonicalized URL, and MUST point to an image file (e.g. a GIF,
         * JPEG, or PNG image file) rather than to a web page containing an image.
         * @return the builder itself
         */
        public Builder setPhotos(List<Photo> photos) {
            this.photos = photos;
            return this;
        }

        /**
         * sets the addresses to the builder
         * @param addresses A physical mailing address for this User
         * @return the builder itself
         */
        public Builder setAddresses(List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * sets the groups to the builder
         * @param groups A physical mailing address for this User
         * @return the builder itself
         */
        public Builder setGroups(List<GroupRef> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * sets the entitlements to the builder
         * @param entitlements a list of entitlements for the User that represent a thing the User has
         * @return the builder itself
         */
        public Builder setEntitlements(List<Entitlement> entitlements) {
            this.entitlements = entitlements;
            return this;
        }

        /**
         * sets the roles to the builder
         * @param roles a list of roles for the User that collectively represent who
         * the User is; e.g., 'Student', "Faculty"
         * @return the builder itself
         */
        public Builder setRoles(List<Role> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * sets the x509Certificates to the builder
         * @param x509Certificates a list of certificates issued to the User. 
         * Values are Binary and DER encoded x509
         * @return the builder itself
         */
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
