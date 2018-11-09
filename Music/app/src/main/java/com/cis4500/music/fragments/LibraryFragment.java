package com.cis4500.music.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cis4500.music.MainActivity;
import com.cis4500.music.R;

public class LibraryFragment extends Fragment {

    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity)getActivity()).setBarTitle("Library");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.library_temp, container, false);
        view.findViewById(R.id.albumBtn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_libraryFragment_to_albumFragment));
        view.findViewById(R.id.songBtn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_libraryFragment_to_songFragment));
        view.findViewById(R.id.artistBtn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_libraryFragment_to_artistFragment));
        return view;
    }
}