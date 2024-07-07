import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.screens.groups.GroupsScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        GroupsScreen()
//        MainScreen()
//        DrawingScreen("Bear")
    }
}