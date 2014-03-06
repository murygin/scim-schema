/*******************************************************************************
 * Copyright (c) 2014 Daniel Murygin.
 *
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Daniel Murygin <dm[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package org.osiam.resources.scim;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;

import org.junit.Test;
import org.osiam.resources.helper.DataUri;

/**
 *
 *
 * @author Daniel Murygin <dm[at]sernet[dot]de>
 */
public class PhotoTest {
    
    private static final String PNG_TO_TEST = "dm.png";
    private static final String PNG_MIME_TYPE = "png";
    private static final String HTML_TEST_CONVERT_IS_TO_DATA_URI_STRING = "./target/testConvertIsToDataUriString.html";
    private static final String HTML_TEST_PHOTO_WITH_DATA_URI = "./target/testPhotoWithDataUri.html";
    
    private static final String HTML_PREFIX = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html lang=\"en\"><head><meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"><title>Data-URL image</title></head><body><p><a href=\"http://de.wikipedia.org/wiki/Data-URL\">Data-URL</a> image:<img src=\"";
    private static final String HTML_SUFFIX = "\" alt=\"Data-URL image\" /></p></body></html>";
    

    @Test
    public void testConvertIsToDataUriString() throws IOException, URISyntaxException {
        InputStream inputStream = getPngAsInputStream();
        String dataUri = DataUri.convertIsToDataUriString(inputStream, PNG_MIME_TYPE);
        saveDataUriImageInHTMLFile(dataUri,HTML_TEST_CONVERT_IS_TO_DATA_URI_STRING);
    }
    
    @Test
    public void testPhotoWithDataUri() throws FileNotFoundException {
        Photo photo = new Photo.Builder()
        .setValue(getPngAsInputStream(),PNG_MIME_TYPE)
        .build();
        String dataUri = photo.getValue();
        saveDataUriImageInHTMLFile(dataUri,HTML_TEST_PHOTO_WITH_DATA_URI);
    }
    
    private void saveDataUriImageInHTMLFile(String dataUri, String filePath) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        sb.append(HTML_PREFIX).append(dataUri).append(HTML_SUFFIX);
        PrintWriter out = new PrintWriter(filePath);
        out.println(sb.toString());
        out.close();
    }
    
    private InputStream getPngAsInputStream() {
        InputStream inputStream = getClass().getResourceAsStream(PNG_TO_TEST);
        return inputStream;
    }

}
