/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;
import java.util.Locale;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.osiam.resources.type.GroupRefType;

/**
 * used to deserialize JSon String to a {@link GroupRefType} enum
 *
 */
public class JsonGroupRefTypeDeserializer extends JsonDeserializer<GroupRefType> {

    @Override
    public GroupRefType deserialize(final JsonParser parser, final DeserializationContext context) throws IOException
    {
        final String jsonValue = parser.getText();
        return GroupRefType.valueOf(jsonValue.toUpperCase(Locale.ENGLISH));
    }

}
