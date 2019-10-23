package vn.com.mob1032_ps10814_lab8_bai1;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebviewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(url.indexOf("google.com")>-1)
            return true;
        else
            return false;

    }
}
