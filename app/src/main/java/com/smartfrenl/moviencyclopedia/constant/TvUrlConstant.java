package com.smartfrenl.moviencyclopedia.constant;

public class TvUrlConstant {

    private TvUrlConstant() {
        throw new IllegalStateException("Constant class");
    }

    private static final String BASE_URL_TV = "https://api.themoviedb.org/3/tv/";

    private static final String NOW_PLAYING_URL = BASE_URL_TV + "airing_today";
    private static final String POPULAR_URL = BASE_URL_TV + "popular";
    private static final String TOP_RATED_URL = BASE_URL_TV + "top_rated";
    private static final String ON_THE_AIR_URL = BASE_URL_TV + "on_the_air";

    public static String getNowPlayingUrl() {
        return NOW_PLAYING_URL;
    }

    public static String getPopularUrl() {
        return POPULAR_URL;
    }

    public static String getTopRatedUrl() {
        return TOP_RATED_URL;
    }

    public static String getOnTheAirUrl() {
        return ON_THE_AIR_URL;
    }
}
