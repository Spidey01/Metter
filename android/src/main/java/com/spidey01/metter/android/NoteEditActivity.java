package com.spidey01.metter.android;

import android.app.Activity;
import android.os.Bundle;

public class NoteEditActivity extends Activity {

    /** The activity is being created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.note_edit);
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
