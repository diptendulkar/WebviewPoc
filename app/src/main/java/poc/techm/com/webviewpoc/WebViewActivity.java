package poc.techm.com.webviewpoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Intent intent = getIntent();
        String message = intent.getStringExtra("url");
       // Toast.makeText(this,"URL:" + message,Toast.LENGTH_LONG).show();
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
      /*  if(!message.contains("http"))
            message = "http://" + message;

        if(!message.isEmpty())
            webView.loadUrl(message);
        else*/
            webView.loadUrl("https://share.sebi.gov.in/remote/login?lang=en");
    }
}
