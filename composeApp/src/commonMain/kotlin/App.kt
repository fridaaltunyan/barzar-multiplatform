
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.fridaaltunyan.barzar.presentation.screens.choice.ChoiceScreen
import com.fridaaltunyan.barzar.presentation.screens.onboarding.OnBoardingViewModel
import com.fridaaltunyan.barzar.presentation.screens.onboarding.OnboardScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@KoinExperimentalAPI
@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinContext {
            val viewModel = koinViewModel<OnBoardingViewModel>()
            val isFirstTimeLaunched = viewModel.isFirstLaunch.collectAsState()
            if (isFirstTimeLaunched.value == true) OnboardScreen()
            else ChoiceScreen()
        }

//        GroupsScreen()
//        MainScreen()
//        DrawingScreen("Bear")
    }
}