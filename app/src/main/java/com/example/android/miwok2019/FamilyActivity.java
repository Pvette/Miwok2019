package com.example.android.miwok2019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");

        words.add(new Word("father","әpә"));
        words.add(new Word("mother","әṭa"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "tete"));
        words.add(new Word("younger sister", "kolliti"));
        words.add(new Word("grandmother", "ṭama"));
        words.add(new Word("grandfather", "pappa"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView wordView = new TextView(this);



    }



}
