/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.osiam.resources.type.PhoneNumberType;

/**
 * used to deserialize JSon String to a {@link PhoneNumberType} enum
 *
 */
public class JsonPhoneNumberTypeDeserializer extends JsonDeserializer<PhoneNumberType> {

    @Override
    public PhoneNumberType deserialize(final JsonParser parser, final DeserializationContext context) throws IOException
    {
        final String jsonValue = parser.getText();
        return PhoneNumberType.valueOf(jsonValue.toUpperCase());
    }

}
