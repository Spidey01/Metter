package com.spidey01.metter.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
public class NoteEditActivity extends FragmentActivity {

    /** The activity is being created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.note_edit);

        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.note_edit_content);

        if (frag == null) {
            {
                CharSequence m = "frag ==  null";
                Toast toast = Toast.makeText(this, m, Toast.LENGTH_SHORT);
                toast.show();
            }

            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.note_edit_content, new NoteEditFragment());
            ft.commit();
        }
            else
            {
                CharSequence m = "frag !=  null";

                Toast toast = Toast.makeText(this, m, Toast.LENGTH_SHORT);
                toast.show();
            }

    }

    /* The activity is about to become visible.
     */
    @Override
    protected void onStart() {
        super.onStart();
    }

    /* The activity has become visible (it is now "resumed").
     */
    @Override
    protected void onResume() {
        super.onResume();
    }

    /* Another activity is taking focus (this activity is about to be "paused").
     */
    @Override
    protected void onPause() {
        super.onPause();
    }

    /* The activity is no longer visible (it is now "stopped")
     */
    @Override
    protected void onStop() {
        super.onStop();
    }

    /* The activity is about to be destroyed.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

