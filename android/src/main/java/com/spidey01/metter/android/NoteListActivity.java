package com.spidey01.metter.android;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class NoteListActivity extends ListActivity {

    /** The activity is being created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.note_list);
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

    /* This method will be called when an item in the list is selected.
     *
     * {@inheritDoc}
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent n = new Intent(
                NoteListActivity.this,
                NoteEditActivity.class);
        startActivity(n);
    }
}

