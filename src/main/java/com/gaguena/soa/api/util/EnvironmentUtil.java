package com.gaguena.soa.api.util;

import java.util.Optional;

public final class EnvironmentUtil {

    private EnvironmentUtil() {
    }

    /**
     * Key System value.
     * @param name
     * @return
     */
    public static String properties(final String name) {
        return Optional.ofNullable(System.getProperty(name))
                .orElseThrow(() -> new IllegalArgumentException("Not found environment key " + name));
    }

}
