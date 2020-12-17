package com.example.scratch;

import android.content.Context;
import android.view.View;

public class TextView extends View {
    private String mText;

    public TextView(Context context, String mText) {
        super(context);
        this.mText = mText;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
