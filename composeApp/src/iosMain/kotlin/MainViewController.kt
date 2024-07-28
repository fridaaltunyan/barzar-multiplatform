
import androidx.compose.ui.window.ComposeUIViewController
import com.fridaaltunyan.barzar.di.initKoin
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}