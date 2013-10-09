/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.osiam.resources.type.MemberType;

/**
 * used to deserialize JSon String to a {@link MemberType} enum
 *
 */
public class JsonMemberTypeDeserializer extends JsonDeserializer<MemberType> {

    @Override
    public MemberType deserialize(final JsonParser parser, final DeserializationContext context) throws IOException
    {
        final String jsonValue = parser.getText();
        return MemberType.valueOf(jsonValue.toUpperCase());
    }

}
