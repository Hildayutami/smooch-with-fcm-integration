package com.yuhilda.smooch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.smooch.ui.ConversationActivity;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        ConversationActivity.show(this);
    }
}
