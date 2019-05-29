package com.example.lesson23intentreceiver;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String uri_string;
    TextView textView;
    Intent intent;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_uri_message);

        intent = getIntent();
        uri = intent.getData();

        if (uri != null) {
            uri_string = "URI: " + uri.toString();
            textView.setText(uri_string);
        }
    }
}
