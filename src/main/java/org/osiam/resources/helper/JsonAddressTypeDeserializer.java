/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.osiam.resources.type.AddressType;

/**
 * used to deserialize JSon String to a {@link AddressType} enum
 *
 */
public class JsonAddressTypeDeserializer extends JsonDeserializer<AddressType> {

    @Override
    public AddressType deserialize(final JsonParser parser, final DeserializationContext context) throws IOException
    {
        final String jsonValue = parser.getText();
        return AddressType.valueOf(jsonValue.toUpperCase());
    }

}
