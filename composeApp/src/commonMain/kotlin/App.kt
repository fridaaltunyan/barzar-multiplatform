import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.screens.main.MainScreen
import presentation.screens.painting.DrawingScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreen()
//        DrawingScreen("Bear")
    }
}