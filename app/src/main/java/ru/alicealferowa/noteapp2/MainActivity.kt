package ru.alicealferowa.noteapp2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.alicealferowa.noteapp2.navigation.NotesNavHost
import ru.alicealferowa.noteapp2.ui.theme.NoteApp2Theme


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial2ScaffoldPaddingParameter",
        "UnusedMaterialScaffoldPaddingParameter"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteApp2Theme {
               Scaffold(
                   topBar = {
                      TopAppBar(
                            title = {
                            Text(text = "Notes App")
                                    },
                          backgroundColor = Color.Blue,
                          contentColor = Color.White,
                          elevation = 12.dp
                                )
                   },
                   content = {
                       Surface(
                           modifier = Modifier.fillMaxSize(),
                           color = MaterialTheme.colors.background
                       ) {
                           NotesNavHost()
                       }
                   }
               )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NoteApp2Theme {

    }
}