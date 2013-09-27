/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public interface Constants {

    Set<String> CORE_SCHEMAS = new HashSet<>(Arrays.asList("urn:scim:schemas:core:1.0"));
    int MAX_RESULT = 100;
}