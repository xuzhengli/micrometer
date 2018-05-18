/**
 * Copyright 2017 Pivotal Software, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micrometer.core.instrument.util;

import io.micrometer.core.lang.Nullable;

/**
 * Utilities for {@link String}.
 *
 * @author Johnny Lim
 */
public final class StringUtils {

    /**
     * Check if the String is null or has only whitespaces.
     *
     * Modified from {@link org.apache.commons.lang.StringUtils#isBlank(String)}.
     *
     * @param string String to check
     * @return {@code true} if the String is null or has only whitespaces
     */
    public static boolean isBlank(@Nullable String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isWhitespace(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if the String has any non-whitespace character.
     *
     * @param string String to check
     * @return {@code true} if the String has any non-whitespace character
     */
    public static boolean isNotBlank(@Nullable String string) {
        return !isBlank(string);
    }

    private StringUtils() {
    }

}