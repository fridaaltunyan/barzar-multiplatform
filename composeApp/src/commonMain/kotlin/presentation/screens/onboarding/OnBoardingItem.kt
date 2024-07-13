package presentation.screens.onboarding

import barzar.composeapp.generated.resources.Res
import barzar.composeapp.generated.resources.welcome_title
import barzar.composeapp.generated.resources.welcome_txt
import org.jetbrains.compose.resources.StringResource

data class OnBoardingItem(
    val titleRes: StringResource,
    val imageRes: Int? = null,
    val descriptionRes: StringResource,
)
val onboardPagesList = listOf(
    OnBoardingItem(
        imageRes = null,
        titleRes = Res.string.welcome_title,
        descriptionRes = Res.string.welcome_txt
    ), OnBoardingItem(
        imageRes = null,
        titleRes = Res.string.welcome_title,
        descriptionRes = Res.string.welcome_txt
    ), OnBoardingItem(
        imageRes = null,
        titleRes = Res.string.welcome_title,
        descriptionRes = Res.string.welcome_txt
    ), OnBoardingItem(
        imageRes = null,
        titleRes = Res.string.welcome_title,
        descriptionRes = Res.string.welcome_txt
    ), OnBoardingItem(
        imageRes = null,
        titleRes = Res.string.welcome_title,
        descriptionRes = Res.string.welcome_txt
    )
)