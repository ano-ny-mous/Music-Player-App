package com.example.android.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter<Song> {
    private Context mContext;
    int mResource;

    public SongListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Song> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int ArtistValue = getItem(position).getSongOrSinger();
        String Song = getItem(position).getSong();
        String Singer = getItem(position).getSinger();
        String Gender = getItem(position).getGender();
        String Age = getItem(position).getAge();
        com.example.android.music.Song songs = new Song(Song, Singer);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);
        if (ArtistValue == 0) {

            TextView tvSong = (TextView) convertView.findViewById(R.id.textview1);
            TextView tvSinger = (TextView) convertView.findViewById(R.id.textview2);

            tvSong.setText(Song);
            tvSinger.setText(Singer);
            return convertView;
        } else {

            TextView tvSinger = (TextView) convertView.findViewById(R.id.textview2);
            TextView tvGender = (TextView) convertView.findViewById(R.id.textviewgender);
            TextView tvAge = (TextView) convertView.findViewById(R.id.textviewage);

            tvSinger.setText(Singer);
            tvGender.setText(Gender);
            tvAge.setText(Age);
            return convertView;
        }
    }

}
