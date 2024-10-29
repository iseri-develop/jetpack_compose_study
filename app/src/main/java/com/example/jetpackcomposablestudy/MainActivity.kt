package com.example.jetpackcomposablestudy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainContend()
        }
    }

    @Composable
    @Preview
    private fun MainContendPreview() {
        MainContend()
    }

    @Composable
    private fun MainContend() {
        CardMessage()
    }

    @Composable
    private fun CardMessage() {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.size(8.dp))
            Column {
                Text(text = "Autor")
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = "Conteudo")
            }
        }
    }

    private fun showAddForm() {
        startActivity(Intent(this, FormActivity::class.java))
    }
}
