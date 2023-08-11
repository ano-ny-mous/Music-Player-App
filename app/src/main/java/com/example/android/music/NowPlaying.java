package com.example.android.music;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        getSupportActionBar().setTitle("Playing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = findViewById(R.id.textedit);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)

        textView.setText(bundle.getString("abc"));

    }
}