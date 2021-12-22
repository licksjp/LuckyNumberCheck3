package kouzou.number.check.light
import android.os.Bundle
import android.webkit.WebViewClient
import android.webkit.WebView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class SubActivity: AppCompatActivity() {
    lateinit var mAdView: AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        MobileAds.initialize(this) {}
        //広告　ここから
        // MobileAds.initialize(this) {}
        var mAdView: AdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        //広告　ここまで
        //val mywebView = WebView(activityContext)
        val mywebView: WebView = findViewById(R.id.webView)
        mywebView.settings.javaScriptEnabled = true
        // mywebView.setWebContentsDebugginEnabled(true)
        mywebView.loadUrl("file:///android_asset/docs/index.html")



    }
}


