package com.example.android.music;

public class Song {
    int Artist = 0;
    String Song;
    String Singer;
    String Gender;
    String Age;


    public Song(String song, String singer) {
        Song = song;
        Singer = singer;
    }

    public Song(String singer,String gender, String age) {
        Singer = singer;
        Gender = gender;
        Age = age;
        Artist = 1;
    }

    public String getSong() {
        return Song;
    }

    public int getSongOrSinger() {
        return Artist;
    }

    public int getArtist() {
        return Artist;
    }

    public String getGender() {
        return Gender;
    }

    public String getAge() {
        return Age;
    }

    public String getSinger() {
        return Singer;
    }


}
