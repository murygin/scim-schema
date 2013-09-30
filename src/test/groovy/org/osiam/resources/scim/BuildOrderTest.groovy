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

package org.osiam.resources.scim

import org.codehaus.groovy.runtime.typehandling.GroovyCastException
import org.osiam.resources.type.EmailType;
import org.osiam.resources.type.ImsType;
import org.osiam.resources.type.PhoneNumberType;
import org.osiam.resources.type.PhotoType;

import spock.lang.Specification

class BuildOrderTest extends Specification {

    def "address should be able to build operation first"() {
        when: "an address object is built with operation first"
        Address builder = new Address.Builder()
                .setOperation("op")
                .setCountry("country")
                .build()

        then: "the return should be an address so no cast exception should be thrown"
        notThrown(GroovyCastException)

        and: "all values should be set correctly"
        builder.operation == "op"
        builder.country == "country"
    }

    def "email should be able to build bottom to top"() {
        when: "an Email object is built with operation first"
        Email builder = new Email.Builder()
                .setOperation("op")
                .setType(EmailType.HOME)
                .build()
				
        then: "the return should be an Email so no cast exception should be thrown"
        notThrown(GroovyCastException)

        and: "all values should be set correctly"
        builder.operation == "op"
        builder.type == EmailType.HOME
    }

    def "entitlement should be able to build bottom to top"() {
        when: "an Entitlement object is built with operation first"
        Entitlement builder = new Entitlement.Builder()
                .setOperation("op")
                .setType("type")
                .build()
				
		then: "the return should be an Entitlement so no cast exception should be thrown"
		notThrown(GroovyCastException)

		and: "all values should be set correctly"
		builder.operation == "op"
		builder.type == "type"
    }

    def "ims should be able to build bottom to top"() {
        when: "an Ims object is built with operation first"
        Ims builder = new Ims.Builder()
                .setOperation("op")
                .setType(ImsType.AIM)
                .build()
				
		then: "the return should be an Ims so no cast exception should be thrown"
		notThrown(GroovyCastException)

		and: "all values should be set correctly"
		builder.operation == "op"
		builder.type == ImsType.AIM
    }

    def "phoneNumber should be able to build bottom to top"() {
        when: "an PhoneNumber object is built with operation first"
        PhoneNumber builder = new PhoneNumber.Builder()
                .setOperation("op")
                .setType(PhoneNumberType.HOME)
                .build()
				
		then: "the return should be an PhoneNumber so no cast exception should be thrown"
		notThrown(GroovyCastException)

		and: "all values should be set correctly"
		builder.operation == "op"
		builder.type == PhoneNumberType.HOME
    }

    def "photo should be able to build bottom to top"() {
        when: "an Photo object is built with operation first"
        Photo builder = new Photo.Builder()
                .setOperation("op")
                .setType(PhotoType.PHOTO)
                .build()
				
		then: "the return should be an Photo so no cast exception should be thrown"
		notThrown(GroovyCastException)

		and: "all values should be set correctly"
		builder.operation == "op"
		builder.type == PhotoType.PHOTO
    }

    def "role should be able to build bottom to top"() {
        when: "an Role object is built with operation first"
        Role builder = new Role.Builder()
                .setOperation("op")
				.setValue("value")
                .build()
				
		then: "the return should be an Role so no cast exception should be thrown"
		notThrown(GroovyCastException)

		and: "all values should be set correctly"
		builder.operation == "op"
		builder.value == "value"
    }

    def "x509Certificate should be able to build bottom to top"() {
        when: "an X509Certificate object is built with operation first"
        X509Certificate builder = new X509Certificate.Builder()
                .setOperation("op")
                .setType("type")
                .build()
				
		then: "the return should be an X509Certificate so no cast exception should be thrown"
		notThrown(GroovyCastException)

		and: "all values should be set correctly"
		builder.operation == "op"
		builder.type == "type"
    }

    def "user should be able to build bottom to top"() {
        when: "an User object is built with operation first"
        User builder = new User.Builder()
                .setId("id")
                .setExternalId("")
                .setNickName("nickname")
                .build()
				
		then: "the return should be an User so no cast exception should be thrown"
		notThrown(GroovyCastException)

		and: "all values should be set correctly"
		builder.id == "id"
		builder.nickName == "nickname"
    }

    def "group should be able to build bottom to top"() {
        when: "an Group object is built with operation first"
        Group builder = new Group.Builder()
                .setId("id")
                .setExternalId("external")
                .setMembers(null)
                .build()
				
		then: "the return should be an Group so no cast exception should be thrown"
		notThrown(GroovyCastException)

		and: "all values should be set correctly"
		builder.id == "id"
		builder.externalId == "external"
    }


}
