package vn.com.mob1032_ps10814_lab8_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText etLink;
Button btnGo;
WebView wvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapComp();



        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = etLink.getText().toString();
                wvMain.loadUrl(path);
                wvMain.setWebViewClient(new WebViewClient());
            }
        });
    }
    public void mapComp(){
        if(etLink == null)
            etLink = findViewById(R.id.etLink);
        if(btnGo == null)
            btnGo = findViewById(R.id.btnGo);
        if(wvMain == null)
            wvMain = findViewById(R.id.wvMain);
    }

}
