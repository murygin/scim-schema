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

import org.osiam.resources.type.EmailType;
import org.osiam.resources.type.ImsType;
import org.osiam.resources.type.PhoneNumberType;
import org.osiam.resources.type.PhotoType;

import spock.lang.Specification

class BuildOrderTest extends Specification {
    def "email should be able to build bottom to top"() {
        given:
        def builder = new Email.Builder()
                .setOperation("op")
                .setType(EmailType.HOME)
    }
	
	def "entitlement should be able to build bottom to top"() {
		given:
		def builder = new Entitlement.Builder()
				.setOperation("op")
				.setType("type")
	}
	
	def "ims should be able to build bottom to top"() {
		given:
		def builder = new Ims.Builder()
				.setOperation("op")
				.setType(ImsType.AIM)
	}
	
	def "phoneNumber should be able to build bottom to top"() {
		given:
		def builder = new PhoneNumber.Builder()
				.setOperation("op")
				.setType(PhoneNumberType.HOME)
	}
	
	def "photo should be able to build bottom to top"() {
		given:
		def builder = new Photo.Builder()
				.setOperation("op")
				.setType(PhotoType.PHOTO)
	}
	
	def "role should be able to build bottom to top"() {
		given:
		def builder = new Role.Builder()
				.setOperation("op")
				.setType("type")
	}
	
	def "x509Certificate should be able to build bottom to top"() {
		given:
		def builder = new X509Certificate.Builder()
				.setOperation("op")
				.setType("type")
	}
	
	def "user should be able to build bottom to top"() {
		given:
		def builder = new User.Builder()
				.setId("")
				.setExternalId("")
				.setNickName("");
	}
	
	def "group should be able to build bottom to top"() {
		given:
		def builder = new Group.Builder()
				.setId("")
				.setExternalId("")
				.setMembers(null);
	}


}
