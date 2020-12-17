package com.example.scratch;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter( Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);
        TextView originalTextView = listItemView.findViewById(R.id.txt_1);
        originalTextView.setmText(currentWord.getOriginalText());

        TextView translatedTextView = listItemView.findViewById(R.id.txt_2);
        translatedTextView.setmText(currentWord.getTranslatedText());
        return listItemView;
    }



}

