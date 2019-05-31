package com.smartfrenl.moviencyclopedia.model.tv;

import java.util.List;

public class Result {
    private String original_name;
    private List<Long> genre_ids;
    private String name;
    private double popularity;
    private List<OriginCountry> origin_ountry;
    private long vote_count;
    private String first_air_date;
    private String backdrop_path;
    private OriginalLanguage original_language;
    private long id;
    private double vote_average;
    private String overview;
    private String poster_path;

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public List<Long> getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(List<Long> genre_ids) {
        this.genre_ids = genre_ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public List<OriginCountry> getOrigin_ountry() {
        return origin_ountry;
    }

    public void setOrigin_ountry(List<OriginCountry> origin_ountry) {
        this.origin_ountry = origin_ountry;
    }

    public long getVote_count() {
        return vote_count;
    }

    public void setVote_count(long vote_count) {
        this.vote_count = vote_count;
    }

    public String getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(String first_air_date) {
        this.first_air_date = first_air_date;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public OriginalLanguage getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(OriginalLanguage original_language) {
        this.original_language = original_language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
}
