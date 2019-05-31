package com.smartfrenl.moviencyclopedia.model.movie;

import java.io.IOException;

public enum OriginalLanguage {
    EN, KO;

    public String toValue() {
        switch (this) {
        case EN: return "en";
        case KO: return "ko";
        }
        return null;
    }

    public static OriginalLanguage forValue(String value) throws IOException {
        if (value.equals("en")) return EN;
        if (value.equals("ko")) return KO;
        throw new IOException("Cannot deserialize OriginalLanguage");
    }
}
