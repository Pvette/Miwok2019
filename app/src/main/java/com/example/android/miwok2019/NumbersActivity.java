package com.example.android.miwok2019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");

        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten", "na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



       // Log.v("NumbersActivity","Word at index 0: " + words.get(0));
       // Log.v("NumbersActivity","Word at index 0: " + words.get(1));
       // Log.v("NumbersActivity","Word at index 0: " + words.get(2));
       // Log.v("NumbersActivity","Word at index 0: " + words.get(3));
       // Log.v("NumbersActivity","Word at index 0: " + words.get(4));
       // Log.v("NumbersActivity","Word at index 0: " + words.get(5));
      //  Log.v("NumbersActivity","Word at index 0: " + words.get(6));
       // Log.v("NumbersActivity","Word at index 0: " + words.get(7));
       // Log.v("NumbersActivity","Word at index 0: " + words.get(8));
      //  Log.v("NumbersActivity","Word at index 0: " + words.get(9));

       // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);


        // Create a variable to keep track of the current index position

       // int index = 0;

        // Keep looping until we've reached the end of the list (which means keep looping

        // as long as the current index position is less than the length of the list)

        // Keep looping until we've reached the end of the list (which means keep looping

        // as long as the current index position is less than the length of the list).

        // The index variable keeps track of our current position in the list and

        // increments by 1 each time the code in the loop is executed.

       // for (int index = 0; index < words.size(); index++) {

            // Create a new TextView

            TextView wordView = new TextView(this);

            // Set the text to be word at the current index

          //  wordView.setText(words.get(index));

            // Add this TextView as another child to the root view of this layout

         //   rootView.addView(wordView);

        }






        // int index = 0;
       // TextView wordView = new TextView(this);
       // wordView.setText(words.get(index));
       // rootView.addView(wordView);

       // index = index + 1

       // TextView wordView2 = new TextView(this);
       // wordView2.setText(words.get(index));
       // rootView.addView(wordView2);

       // index = index + 1

       // TextView wordView3 = new TextView(this);
       // wordView3.setText(words.get(index));
       // rootView.addView(wordView3);
    }


