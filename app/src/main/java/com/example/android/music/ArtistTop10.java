package com.example.android.music;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ArtistTop10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_top10);

        getSupportActionBar().setTitle("Artist's Top Songs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}