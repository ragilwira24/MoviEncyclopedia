package com.smartfrenl.moviencyclopedia.constant;

public class CommonConstant {

    private CommonConstant() {
        throw new IllegalStateException("Constant Class");
    }

    private static final String API_KEY = "ec791866db8d46776adf9e954854a346";

    private static final String BASE_URL_IMAGE = "https://image.tmdb.org/t/p/original";

    public static String getApiKey() {
        return API_KEY;
    }

    public static String getBaseUrlImage() {
        return BASE_URL_IMAGE;
    }
}
