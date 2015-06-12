package com.bli.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final int duration = Toast.LENGTH_SHORT;

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

    public void onClick(View v){
        switch(v.getId()){
            case R.id.spotifyBtn:
                displayToastMessage("This button will launch my Spotify app!");
                break;
            case R.id.scoresBtn:
                displayToastMessage("This button will launch my Scores app!");
                break;
            case R.id.libraryBtn:
                displayToastMessage("This button will launch my Library app!");
                break;
            case R.id.buildBtn:
                displayToastMessage("This button will launch my Build It Bigger app!");
                break;
            case R.id.baconBtn:
                displayToastMessage("This button will launch my Bacon Reader app!");
                break;
            case R.id.capstoneBtn:
                displayToastMessage("This button will launch my Capstone app!");
                break;
        }
    }

    private void displayToastMessage(String message){
        Toast toast = Toast.makeText(this, message, duration);
        toast.show();
    }
}
