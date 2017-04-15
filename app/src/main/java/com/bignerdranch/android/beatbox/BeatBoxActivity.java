package com.bignerdranch.android.beatbox;

import android.app.Activity;
import android.os.Bundle;
//添加新内容

public class BeatBoxActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_beat_box);
    }
}
