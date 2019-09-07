package com.issa.rebosearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mSearchBoxText;

    TextView mUrlDisplatText;

    TextView mSearchResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is id for search list
        mSearchBoxText = (EditText) findViewById(R.id.search_list);

        //this is id for url display
        mUrlDisplatText = (TextView)findViewById(R.id.tv_url_display);

        //this is id for url result
        mSearchResult = (TextView)findViewById(R.id.tv_gitub_result_json);
    }
}
