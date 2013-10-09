/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.osiam.resources.type.PhotoType;

/**
 * used to deserialize JSon String to a {@link PhotoType} enum
 *
 */
public class JsonPhotoTypeDeserializer extends JsonDeserializer<PhotoType> {

    @Override
    public PhotoType deserialize(final JsonParser parser, final DeserializationContext context) throws IOException
    {
        final String jsonValue = parser.getText();
        return PhotoType.valueOf(jsonValue.toUpperCase());
    }

}
