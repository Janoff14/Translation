package com.example.scratch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "uno"));
        words.add(new Word("one", "uno"));
        words.add(new Word("one", "uno"));
        words.add(new Word("one", "uno"));



        WordAdapter wordAdapter = new WordAdapter(MainActivity.this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}