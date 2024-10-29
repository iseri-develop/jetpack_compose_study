package com.example.jetpackcomposablestudy

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FormContent() }
    }

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    private fun FormContent() {
        Column {
            Scaffold(
                topBar = { FormTopAppBar() },
            ) {
                FormFields()
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun FormTopAppBar() {
        TopAppBar(
            title = { Text(text = "add") },
            navigationIcon = {
                IconButton(onClick = { onBackPressedDispatcher.onBackPressed() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack, "Back",
                        tint = colorResource(id = R.color.white)
                    )
                }
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = colorResource(id = R.color.purple_500),
                titleContentColor = colorResource(id = R.color.white)
            )
        )
    }

    @Composable
    private fun FormFields() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {

            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = { Text(text = "Digite aqui seu nome") }
            )

            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = { Text(text = "Digite aqui seu email") }
            )

            DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {

            }
        }
    }


    @Preview
    @Composable
    private fun FormContentPreview() {
        FormContent()
    }

}