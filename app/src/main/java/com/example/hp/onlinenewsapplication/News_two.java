package com.example.hp.onlinenewsapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by HP on 26-08-2022.
 */
public class News_two extends AppCompatActivity
{
    WebView web_news2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_two);
        web_news2 = (WebView)findViewById(R.id.wv);
        web_news2.loadUrl("https://epapervijayavani.in/");
    }
}
