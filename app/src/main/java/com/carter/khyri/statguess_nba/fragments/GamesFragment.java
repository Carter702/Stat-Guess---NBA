package com.carter.khyri.statguess_nba.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.adapters.GameAdapter;
import com.carter.khyri.statguess_nba.models.Games;
import com.carter.khyri.statguess_nba.network.ApiService;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class GamesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    RecyclerView mRecyclerView;
    GameAdapter mGameAdapter;
    Games games = new Games();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GamesFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static GamesFragment newInstance(String param1, String param2) {
        GamesFragment fragment = new GamesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_games, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.game_recycler);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        Retrofit.Builder builder = new Retrofit.Builder().baseUrl("https://data.nba.net/")
        .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        ApiService api = retrofit.create(ApiService.class);
        Call<Games> call = api.getGameData();

        call.enqueue(new Callback<Games>() {
            @Override
            public void onResponse(Call<Games> call, Response<Games> response) {

                Log.i("HERE", "YOU GOT IT");

                games = response.body();
                mGameAdapter = new GameAdapter(games);
                mRecyclerView.setAdapter(mGameAdapter);

            }

            @Override
            public void onFailure(Call<Games> call, Throwable t) {
                Log.e("ERROR","error connecting");
                t.printStackTrace();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

/*    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
