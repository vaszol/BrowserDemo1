package com.example.vas.browserdemo1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class BrowserDemo1 extends Activity {

    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_demo1);
        browser= (WebView) findViewById(R.id.webkit);
        browser.loadUrl("http://vaszol.ru");
    }
}
