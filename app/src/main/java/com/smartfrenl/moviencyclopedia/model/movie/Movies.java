package com.smartfrenl.moviencyclopedia.model.movie;

import java.util.List;

public class Movies {

    private List<Result> results;
    private long page;
    private long totalResults;
    private Dates dates;
    private long totalPages;

    public List<Result> getResults() { return results; }
    public void setResults(List<Result> value) { this.results = value; }

    public long getPage() { return page; }
    public void setPage(long value) { this.page = value; }

    public long getTotalResults() { return totalResults; }
    public void setTotalResults(long value) { this.totalResults = value; }

    public Dates getDates() { return dates; }
    public void setDates(Dates value) { this.dates = value; }

    public long getTotalPages() { return totalPages; }
    public void setTotalPages(long value) { this.totalPages = value; }
}
