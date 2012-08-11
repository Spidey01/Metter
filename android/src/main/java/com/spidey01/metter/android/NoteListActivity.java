package com.spidey01.metter.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class NoteListActivity extends FragmentActivity {

    /** The activity is being created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        // setContentView(R.layout.note_list);

        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.note_list_content);

        if (frag == null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.note_edit_content, new NoteListFragment());
            ft.commit();
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

