/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.osiam.resources.type.ImsType;

/**
 * used to deserialize JSon String to a {@link ImsType} enum
 *
 */
public class JsonImsTypeDeserializer extends JsonDeserializer<ImsType> {

    @Override
    public ImsType deserialize(final JsonParser parser, final DeserializationContext context) throws IOException, JsonProcessingException
    {
        final String jsonValue = parser.getText();
        return ImsType.valueOf(jsonValue.toUpperCase());
    }

}
