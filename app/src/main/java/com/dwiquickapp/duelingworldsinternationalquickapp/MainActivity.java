package com.dwiquickapp.duelingworldsinternationalquickapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.rcMusicAppText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.bgdMusicAppText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.rcbgdMusicAppText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.dwiHomeTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.bseHomeTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.bsmeHomeTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.dwiWebAppTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.dwiBlogTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.dwiShopTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.dwiRestHomeTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.dwiBgdHomeTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.dwiVivsHomeTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void openBrowser(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse(url));

        startActivity(intent);
    }

}