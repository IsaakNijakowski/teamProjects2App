package com.example.testproject4

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.webkit.WebViewClientCompat
import com.example.testproject4.ui.theme.Testproject4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Testproject4Theme {
                MyScreen()
            }
        }
    }
}

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun MyWebView(url: String) {
    AndroidView(factory = { context ->
        WebView(context).apply {
            webViewClient = WebViewClientCompat()
            settings.javaScriptEnabled = true
            settings.allowContentAccess = true
            settings.domStorageEnabled = true

            // ngrok skip browser warning header
            val headers = mapOf("ngrok-skip-browser-warning" to "true")
            loadUrl(url, headers)
        }
    })
}



@Preview(showBackground = true)
@Composable
fun MyScreen() {
    MyWebView(url = "https://skink-helping-deadly.ngrok-free.app/")
}