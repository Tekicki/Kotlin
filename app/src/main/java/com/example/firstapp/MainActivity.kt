package com.example.firstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var helloTextView: TextView
    private lateinit var textView: TextView
    private val button: Button by lazy { findViewById<Button>(R.id.button) }
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.helloTextView)
        textView = findViewById(R.id.textView)

        textView.text = "Liczba kliknięć: $clickCount"

        button.setOnClickListener {
            clickCount++
            textView.text = "Liczba kliknięć: $clickCount"
        }

    }

}
