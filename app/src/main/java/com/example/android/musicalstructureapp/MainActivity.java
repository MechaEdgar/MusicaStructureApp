package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.musicalstructureapp.R.id.exploreView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content of the activity for use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the Playing category
        TextView playingView = (TextView) findViewById(R.id.playingView);

        //Attach the view to an OnClickListener
        playingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a toast that shows what view are you opening
                Toast.makeText(v.getContext(), "Open the Play Activity", Toast.LENGTH_SHORT).show();

                // Start an Explicit Intent to launch the Playing Activity
                Intent PlayingIntent = new Intent(MainActivity.this,
                        Playing.class);
                //Launch the Playing Activity
                startActivity(PlayingIntent);
            }
        });

        //Find the view that shows the home category
        TextView homeView = (TextView) findViewById(R.id.homeView);

        //Attach the view to an OnClickListener
        homeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a toast that shows what view are you opening
                Toast.makeText(v.getContext(), "Open the home activity", Toast.LENGTH_SHORT).show();

                //Start an Explicit Intent to launch the homeActivity
                Intent homeIntent = new Intent(MainActivity.this,
                        HomeActivity.class);
                startActivity(homeIntent);
            }
        });

        //Find the view that shows the search category
        TextView categoryView = (TextView) findViewById(R.id.searchView);

        //Attach the view to an OnClickListener
        categoryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a toast that shows what view are you opening
                Toast.makeText(v.getContext(), "Open the Search Activity", Toast.LENGTH_SHORT).show();

                //Start an Explicit Intent to launch the SearchView
                Intent searchIntent = new Intent(MainActivity.this,
                        SearchActivity.class);
                //Launch the searchIntent
                startActivity(searchIntent);
            }
        });

        //Find the view that shows the Explore category
        TextView exploreView = (TextView) findViewById(R.id.exploreView);

        //Attach the view to an OnClickListener
        exploreView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a toast that shows what view are you opening
                Toast.makeText(v.getContext(), "Open the Explore Activity", Toast.LENGTH_SHORT).show();

                //Start an Explicit Intent to launch the SearchView
                Intent exploreIntent = new Intent(MainActivity.this,
                        ExploreActivity.class);
                //Launch the searchIntent
                startActivity(exploreIntent);
            }
        });

        //Find the view that shows the library category
        TextView libraryView = (TextView) findViewById(R.id.libraryView);

        //Attach the view to an OnClickListener
        libraryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a toast that shows what view are you opening
                Toast.makeText(v.getContext(), "Open the Library Activity", Toast.LENGTH_SHORT).show();

                //Start an Explicit Intent to launch the SearchView
                Intent libraryIntent = new Intent(MainActivity.this,
                        LibraryActivity.class);
                //Launch the searchIntent
                startActivity(libraryIntent);
            }
        });
    }
}
