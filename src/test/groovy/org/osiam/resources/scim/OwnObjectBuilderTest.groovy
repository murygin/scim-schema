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

import org.osiam.resources.scim.Photo.Builder;
import org.osiam.resources.type.AddressType;
import org.osiam.resources.type.EmailType;
import org.osiam.resources.type.GroupRefType;
import org.osiam.resources.type.ImsType;
import org.osiam.resources.type.PhoneNumberType;
import org.osiam.resources.type.PhotoType;

import spock.lang.Specification

class OwnObjectBuilderTest extends Specification {
    def "Address builder wit Own Object builds correct"() {
		given:
        def oldAddress = new Address.Builder()
                .setCountry("country")
				.setFormatted("formatted")
				.setLocality("locality")
				.setOperation("operation")
				.setPostalCode("postaCode")
				.setRegion("region")
				.setStreetAddress("street")
				.setType(AddressType.OTHER)
				.build();
		
		when:		
		def newAddress = new Address.Builder(oldAddress).build();
        
		then:
		oldAddress.getCountry() == newAddress.getCountry()
		oldAddress.getFormatted() == newAddress.getFormatted()
		oldAddress.getLocality() == newAddress.getLocality()
		oldAddress.getOperation() == newAddress.getOperation()
		oldAddress.getPostalCode() == newAddress.getPostalCode()
		oldAddress.getRegion() == newAddress.getRegion()
		oldAddress.getStreetAddress() == newAddress.getStreetAddress()
	}
	
	def "email builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new Email.Builder()
				.setOperation("operation")
				.setPrimary(true)
				.setType(EmailType.HOME)
				.setValue("value")
				.build();
		
		when:
		def newAttribute = new Email.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getOperation() == newAttribute.getOperation()
		oldAttribute.isPrimary() == newAttribute.isPrimary()
		oldAttribute.getType() == newAttribute.getType()
		oldAttribute.getValue() == newAttribute.getValue()
	}

	def "entitlement builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new Entitlement.Builder()
				.setOperation("operation")
				.setPrimary(true)
				.setType("type")
				.setValue("value")
				.build();
		
		when:
		def newAttribute = new Entitlement.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getOperation() == newAttribute.getOperation()
		oldAttribute.isPrimary() == newAttribute.isPrimary()
		oldAttribute.getType() == newAttribute.getType()
		oldAttribute.getValue() == newAttribute.getValue()
	}

	def "groupRef builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new GroupRef.Builder()
				.setOperation("operation")
				.setPrimary(true)
				.setType(GroupRefType.DIRECT)
				.setValue("value")
				.build();
		
		when:
		def newAttribute = new GroupRef.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getOperation() == newAttribute.getOperation()
		oldAttribute.isPrimary() == newAttribute.isPrimary()
		oldAttribute.getType() == newAttribute.getType()
		oldAttribute.getValue() == newAttribute.getValue()
	}
	
	def "ims builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new Ims.Builder()
				.setOperation("operation")
				.setPrimary(true)
				.setType(ImsType.AIM)
				.setValue("value")
				.build();
		
		when:
		def newAttribute = new Ims.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getOperation() == newAttribute.getOperation()
		oldAttribute.isPrimary() == newAttribute.isPrimary()
		oldAttribute.getType() == newAttribute.getType()
		oldAttribute.getValue() == newAttribute.getValue()
	}
	
	def "Name builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new Name.Builder()
				.setFamilyName("familyNamm")
				.setFormatted("formatted")
				.setGivenName("givenName")
				.setHonorificPrefix("H Prefix")
				.setHonorificSuffix("H Suffix")
				.setMiddleName("middleName")
				.build();
		
		when:
		def newAttribute = new Name.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getFamilyName() == newAttribute.getFamilyName()
		oldAttribute.getFormatted() == newAttribute.getFormatted()
		oldAttribute.getGivenName() == newAttribute.getGivenName()
		oldAttribute.getHonorificPrefix() == newAttribute.getHonorificPrefix()
		oldAttribute.getMiddleName() == newAttribute.getMiddleName()
	}
	
	def "phonenumber builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new PhoneNumber.Builder()
				.setOperation("operation")
				.setPrimary(true)
				.setType(PhoneNumberType.HOME)
				.setValue("value")
				.build();
		
		when:
		def newAttribute = new PhoneNumber.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getOperation() == newAttribute.getOperation()
		oldAttribute.isPrimary() == newAttribute.isPrimary()
		oldAttribute.getType() == newAttribute.getType()
		oldAttribute.getValue() == newAttribute.getValue()
	}
	
	def "photo builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new Photo.Builder()
				.setOperation("operation")
				.setPrimary(true)
				.setType(PhotoType.PHOTO)
				.setValue("value")
				.build();
		
		when:
		def newAttribute = new Photo.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getOperation() == newAttribute.getOperation()
		oldAttribute.isPrimary() == newAttribute.isPrimary()
		oldAttribute.getType() == newAttribute.getType()
		oldAttribute.getValue() == newAttribute.getValue()
	}
	
	def "role builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new Role.Builder()
				.setOperation("operation")
				.setPrimary(true)
				.setType("type")
				.setValue("value")
				.build();
		
		when:
		def newAttribute = new Role.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getOperation() == newAttribute.getOperation()
		oldAttribute.isPrimary() == newAttribute.isPrimary()
		oldAttribute.getType() == newAttribute.getType()
		oldAttribute.getValue() == newAttribute.getValue()
	}
	
	def "x509Certificate builder wit Own Object builds correct"() {
		given:
		def oldAttribute = new X509Certificate.Builder()
				.setOperation("operation")
				.setPrimary(true)
				.setType("type")
				.setValue("value")
				.build();
		
		when:
		def newAttribute = new X509Certificate.Builder(oldAttribute).build();
		
		then:
		oldAttribute.getOperation() == newAttribute.getOperation()
		oldAttribute.isPrimary() == newAttribute.isPrimary()
		oldAttribute.getType() == newAttribute.getType()
		oldAttribute.getValue() == newAttribute.getValue()
	}
}
