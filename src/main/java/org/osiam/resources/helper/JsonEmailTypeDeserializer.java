/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;
import java.util.Locale;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.osiam.resources.type.EmailType;

/**
 * used to deserialize JSon String to a {@link Email} enum
 *
 */
public class JsonEmailTypeDeserializer extends JsonDeserializer<EmailType> {

    @Override
    public EmailType deserialize(final JsonParser parser, final DeserializationContext context) throws IOException
    {
        final String jsonValue = parser.getText();
        return EmailType.valueOf(jsonValue.toUpperCase(Locale.ENGLISH));
    }

}
