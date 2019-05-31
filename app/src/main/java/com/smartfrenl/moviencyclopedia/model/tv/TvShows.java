package com.smartfrenl.moviencyclopedia.model.tv;

import java.util.List;

public class TvShows {
    private long page;
    private long total_results;
    private long total_pages;
    private List<Result> results;

    public long getPage() { return page; }
    public void setPage(long value) { this.page = value; }

    public long getTotal_results() {
        return total_results;
    }

    public void setTotal_results(long total_results) {
        this.total_results = total_results;
    }

    public long getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(long total_pages) {
        this.total_pages = total_pages;
    }

    public List<Result> getResults() { return results; }
    public void setResults(List<Result> value) { this.results = value; }
}
