/*
 * Copyright (C) 2014 tarent AG
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
package org.osiam.resources.helper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.bind.DatatypeConverter;

import org.osiam.resources.scim.Photo;

/**
 *
 *
 * @author Daniel Murygin <dm[at]sernet[dot]de>
 */
public final class DataUri {

    public static URL convertStringToUrl(String value) throws MalformedURLException {
        return new URL(value);        
    }

    public static String convertIsToDataUriString(InputStream is, String mimeType) throws IOException, URISyntaxException {
        URI dataUri = DataUri.convertIsToDataUri(is, mimeType);
        return DataUri.convertUriToString(dataUri);
               
    }

    public static URI convertIsToDataUri(InputStream is, String mimeType) throws IOException, URISyntaxException {
        String dataAsString = DataUri.convertIsToString(is);
        StringBuilder sb = new StringBuilder();
        sb.append(Photo.DATA_IMAGE).append(mimeType).append(Photo.BASE64).append(dataAsString);
        return new URI(sb.toString());     
    }

    public static String convertIsToString(InputStream is) throws IOException {
        return DatatypeConverter.printBase64Binary(DataUri.convertIsToByteArray(is));
    }

    public static byte[] convertIsToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];
        while ((nRead = is.read(data, 0, data.length)) != -1) {
          buffer.write(data, 0, nRead);
        }
        buffer.flush();
        return buffer.toByteArray();
    }

    public static String convertUriToString(URI uri) {
        return uri.toString();
    }

    public static String convertUrlToString(URL url) {
        return url.toString();
    }

}
