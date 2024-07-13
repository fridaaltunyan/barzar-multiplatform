
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.screens.onboarding.OnboardScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        OnboardScreen()
//        GroupsScreen()
//        MainScreen()
//        DrawingScreen("Bear")
    }
}