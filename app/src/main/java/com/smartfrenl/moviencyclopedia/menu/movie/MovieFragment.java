package com.smartfrenl.moviencyclopedia.menu.movie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartfrenl.moviencyclopedia.R;
import com.smartfrenl.moviencyclopedia.adapter.movie.ComingSoonAdapter;
import com.smartfrenl.moviencyclopedia.adapter.movie.NowPlayingAdapter;
import com.smartfrenl.moviencyclopedia.adapter.movie.PopularAdapter;
import com.smartfrenl.moviencyclopedia.adapter.movie.TopRatedAdapter;
import com.smartfrenl.moviencyclopedia.model.movie.Result;
import com.smartfrenl.moviencyclopedia.service.movie.ComingSoonService;
import com.smartfrenl.moviencyclopedia.service.movie.NowPlayingService;
import com.smartfrenl.moviencyclopedia.service.movie.PopularService;
import com.smartfrenl.moviencyclopedia.service.movie.TopRatedService;

import java.util.ArrayList;
import java.util.List;

public class MovieFragment extends Fragment {

    public MovieFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private List<Result> results;

    private NowPlayingAdapter nowPlayingAdapter;

    private ComingSoonAdapter comingSoonAdapter;
    private TopRatedAdapter topRatedAdapter;
    private PopularAdapter popularAdapter;

    private List<Result> comingSoons;
    private RecyclerView comingSoonRV;

    public static MovieFragment newInstance(String param1, String param2) {
        MovieFragment movieFragment = new MovieFragment();
        Bundle args = new Bundle();
        movieFragment.setArguments(args);
        return movieFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.movie_fragment, container, false);
        results = new ArrayList<>();
        nowPlayingAdapter = new NowPlayingAdapter(getActivity(),results);
        NowPlayingService.showNowPlayingItems(view, recyclerView, nowPlayingAdapter, results, getActivity());

        comingSoons = new ArrayList<>();
        comingSoonAdapter = new ComingSoonAdapter(getActivity(),comingSoons);
        ComingSoonService.comingSoonItems(view, comingSoonRV, comingSoonAdapter, comingSoons, getActivity());

        results.clear();
        results = new ArrayList<>();
        topRatedAdapter = new TopRatedAdapter(getActivity(), results);
        TopRatedService.topRatedItems(view, recyclerView, topRatedAdapter, results, getActivity());

        results.clear();
        results = new ArrayList<>();
        popularAdapter = new PopularAdapter(getActivity(), results);
        PopularService.popularItems(view, recyclerView, popularAdapter, results, getActivity());

        return view;
    }


}
