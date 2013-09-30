/*
 * for licensing see the file license.txt.
 */
package org.osiam.resources.helper;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * used to serialize a {@link Date} enum into a JSon String 
 *
 */
public class JsonDateSerializer extends JsonSerializer<Date> {

    private final DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.dateTime();

    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(dateTimeFormatter.print(value.getTime()));
    }
}
