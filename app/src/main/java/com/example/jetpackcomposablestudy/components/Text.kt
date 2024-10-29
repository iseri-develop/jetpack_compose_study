import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposablestudy.R

@Preview
@Composable
private fun Preview() {
    SimpleText()
}

@Composable
private fun SimpleText() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = stringResource(R.string.hello_world),
            color = Color.Blue,
            fontSize = 24.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth())
    }
}

@Composable
private fun TextShadow() {
    
}
