package com.example.hp.onlinenewsapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

/**
 * Created by HP on 26-08-2022.
 */
public class News_one extends AppCompatActivity
{
    WebView web_news1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_one);
        web_news1 = (WebView)findViewById(R.id.wv);
        web_news1.loadUrl("https://m.timesofindia.com/");
        }
        }
