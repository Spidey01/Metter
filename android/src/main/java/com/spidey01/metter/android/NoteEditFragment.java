package com.spidey01.metter.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NoteEditFragment extends Fragment {

    private TextView mWidget;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
    {
        
        View view = inflater.inflate(R.layout.note_edit_fragment, container, false);
        
        mWidget = (TextView)view.findViewById(R.id.note_edit_widget);

        return view;
    }

}
