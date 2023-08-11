package com.example.android.music;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        getSupportActionBar().setTitle("Artists");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listview = (ListView) findViewById(R.id.songslist);
        final Song artist1 = new Song("Dua Lipa","Gender:F","Age:24");
        Song artist2 = new Song("Lady Gaga","Gender:F","Age:34");
        Song artist3 = new Song("Kygo","Gender:M","Age:28");
        Song artist4 = new Song("Justin Bieber","Gender:M","Age:26");
        Song artist5 = new Song("Morgan Wallen","Gender:M","Age:27");
        Song artist6 = new Song("Billie Eilish","Gender:F","Age:18");

        final ArrayList<Song> songlist = new ArrayList<>();
        songlist.add(artist1);
        songlist.add(artist2);
        songlist.add(artist3);
        songlist.add(artist4);
        songlist.add(artist5);
        songlist.add(artist6);

        SongListAdapter songAdapter = new SongListAdapter(this, R.layout.adapter_view_artist, songlist);
        listview.setAdapter(songAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(Artists.this, ArtistTop10.class);

                startActivity(intent);

            }
        });
    }


}