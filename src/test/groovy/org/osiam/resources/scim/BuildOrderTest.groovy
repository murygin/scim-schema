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

        then: "the return should be an address an throw no cast exception"
        notThrown(GroovyCastException)
    }

    def "email should be able to build bottom to top"() {
        given:
        Email builder = new Email.Builder()
                .setOperation("op")
                .setType(EmailType.HOME)
                .build()
    }

    def "entitlement should be able to build bottom to top"() {
        given:
        Entitlement builder = new Entitlement.Builder()
                .setOperation("op")
                .setType("type")
                .build()
    }

    def "ims should be able to build bottom to top"() {
        given:
        Ims builder = new Ims.Builder()
                .setOperation("op")
                .setType(ImsType.AIM)
                .build()
    }

    def "phoneNumber should be able to build bottom to top"() {
        given:
        PhoneNumber builder = new PhoneNumber.Builder()
                .setOperation("op")
                .setType(PhoneNumberType.HOME)
                .build()
    }

    def "photo should be able to build bottom to top"() {
        given:
        Photo builder = new Photo.Builder()
                .setOperation("op")
                .setType(PhotoType.PHOTO)
                .build()
    }

    def "role should be able to build bottom to top"() {
        given:
        Role builder = new Role.Builder()
                .setOperation("op")
                .setType("type")
                .build()
    }

    def "x509Certificate should be able to build bottom to top"() {
        given:
        X509Certificate builder = new X509Certificate.Builder()
                .setOperation("op")
                .setType("type")
                .build()
    }

    def "user should be able to build bottom to top"() {
        given:
        User builder = new User.Builder()
                .setId("")
                .setExternalId("")
                .setNickName("")
                .build()
    }

    def "group should be able to build bottom to top"() {
        given:
        Group builder = new Group.Builder()
                .setId("")
                .setExternalId("")
                .setMembers(null)
                .build()
    }


}
