package com.cis4500.music.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cis4500.music.R;
import com.cis4500.music.adapters.SongRecyclerViewAdapter;
import com.cis4500.music.adapters.SongRecyclerViewAdapter.SongRecyclerViewDelegate;
import com.cis4500.music.models.Song;

import java.util.List;


public class SongFragment extends Fragment implements SongRecyclerViewDelegate {

    private List<Song> songs;

    public SongFragment() {
    }

    @SuppressWarnings("unused")
    public static SongFragment newInstance(int columnCount) {
        SongFragment fragment = new SongFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load songs from data source

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_layout, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setAdapter(new SongRecyclerViewAdapter(songs, this));
        }
        return view;
    }

    @Override
    public void didSelectSong(Song song) {

    }
}