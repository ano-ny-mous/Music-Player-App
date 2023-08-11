package com.example.android.music;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class AllSongs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        getSupportActionBar().setTitle("All Songs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ListView listview = (ListView) findViewById(R.id.songslist);
        Song song1 = new Song("Break My Heart", "Dua Lipa");
        Song song2 = new Song("Rain On Me", "Lady Gaga");
        Song song3 = new Song("Lose Somebody", "Kygo");
        Song song4 = new Song("Intentions", "Justin Bieber");
        Song song5 = new Song("Don't Start Now", "Dua Lipa");
        Song song6 = new Song("Control", "Zoe Wees");

        final ArrayList<Song> songlist = new ArrayList<>();
        songlist.add(song1);
        songlist.add(song2);
        songlist.add(song3);
        songlist.add(song4);
        songlist.add(song5);
        songlist.add(song6);

        SongListAdapter songAdapter = new SongListAdapter(this, R.layout.adapter_view_songs, songlist);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(AllSongs.this, NowPlaying.class);
                intent.putExtra("abc","545454");
                startActivity(intent);
            }
        });
        listview.setAdapter(songAdapter);

    }

}