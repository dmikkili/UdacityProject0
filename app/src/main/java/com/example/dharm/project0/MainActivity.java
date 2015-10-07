package com.example.dharm.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Displays a message about the button that the user has selected. */
    public void showToastMessage(View view) {
        String message;
        switch(view.getId())
        {
            case R.id.spotify_button:
                message = "This is where my spotify app will be.";
                break;
            case R.id.scores_button:
                message = "This is where my scores app will be.";
                break;
            case R.id.library_button:
                message = "This is where my library app will be.";
                break;
            case R.id.build_it_bigger_button:
                message = "This is where my build it bigger app will be.";
                break;
            case R.id.xyz_reader_button:
                message = "This is where my xyz reader app will be.";
                break;
            default:
                message = "This is where my capstone app will be in the future.";
                break;
        }
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.show();
    }

}
