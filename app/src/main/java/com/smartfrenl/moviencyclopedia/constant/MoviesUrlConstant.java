package com.smartfrenl.moviencyclopedia.constant;

public class MoviesUrlConstant {

    private MoviesUrlConstant(){
        throw new IllegalStateException("Constant Class");
    }

    private static final String BASE_URL_MOVIE = "https://api.themoviedb.org/3/movie/";

    private static final String NOW_PLAYING_URL = BASE_URL_MOVIE + "now_playing";
    private static final String POPULAR_URL = BASE_URL_MOVIE + "popular";
    private static final String TOP_RATED_URL = BASE_URL_MOVIE + "top_rated";
    private static final String UPCOMING_URL = BASE_URL_MOVIE + "upcoming";

    public static String getNowPlayingUrl() {
        return NOW_PLAYING_URL;
    }

    public static String getPopularUrl() {
        return POPULAR_URL;
    }

    public static String getTopRatedUrl() {
        return TOP_RATED_URL;
    }

    public static String getUpcomingUrl() {
        return UPCOMING_URL;
    }
}
