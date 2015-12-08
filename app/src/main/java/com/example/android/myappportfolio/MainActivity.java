package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
    }

    // This methods show a Toast when the related buttons are clicked.
    public void sendMessage(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Spotify App!", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage2(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Scores App!", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage3(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Library App!", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage4(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Build it Bigger App!", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage5(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader App!", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage6(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone!", Toast.LENGTH_SHORT).show();
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


}
