package com.spidey01.metter.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class NoteListFragment extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        
        View view = inflater.inflate(R.layout.note_list_fragment, container, false);
        
        return view;
    }

    /* This method will be called when an item in the list is selected.
     *
     * {@inheritDoc}
     */
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent n = new Intent(
                getActivity(),
                NoteEditActivity.class);
        startActivity(n);
    }
}

