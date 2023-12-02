package com.example.hp.onlinenewsapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by HP on 26-08-2022.
 */
public class News_four extends AppCompatActivity
{
    WebView web_news4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_four);
        web_news4 = (WebView)findViewById(R.id.wv);
        web_news4.loadUrl("https://sudharmasanskritdaily.in/");
    }
}
