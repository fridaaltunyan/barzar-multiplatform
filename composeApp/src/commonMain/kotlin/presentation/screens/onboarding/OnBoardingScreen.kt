package presentation.screens.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.stringResource

@Composable
fun OnboardScreen() {

    val onboardPages = onboardPagesList

    val currentPage = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        OnBoardDetails(
            modifier = Modifier
                .weight(1f)
                .padding(16.dp),
            currentPage = onboardPages[currentPage.value]
        )

        OnBoardNavButton(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp),
            currentPage = currentPage.value,
            noOfPages = onboardPages.size
        ) {
            currentPage.value++
        }

        TabSelector(
            onboardPages = onboardPages,
            currentPage = currentPage.value
        ) { index ->
            currentPage.value = index
        }
    }
}

@Composable
fun OnBoardDetails(
    modifier: Modifier = Modifier, currentPage: OnBoardingItem
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(currentPage.titleRes),
            style = MaterialTheme.typography.displaySmall,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(currentPage.descriptionRes),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun OnBoardNavButton(
    modifier: Modifier = Modifier, currentPage: Int, noOfPages: Int, onNextClicked: () -> Unit
) {
    Button(
        onClick = {
            if (currentPage < noOfPages - 1) {
                onNextClicked()
            } else {
                // Handle onboarding completion
            }
        }, modifier = modifier
    ) {
        Text(text = if (currentPage < noOfPages - 1) "Next" else "Get Started")
    }
}

@Composable
fun TabSelector(
    onboardPages: List<OnBoardingItem>,
    currentPage: Int,
    onTabSelected: (Int) -> Unit
) {
    TabRow(
        selectedTabIndex = currentPage,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        onboardPages.forEachIndexed { index, _ ->
            Tab(selected = index == currentPage, onClick = {
                onTabSelected(index)
            }, modifier = Modifier.padding(16.dp), content = {
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .background(
                            color = if (index == currentPage) MaterialTheme.colorScheme.onPrimary
                            else Color.LightGray, shape = RoundedCornerShape(4.dp)
                        )
                )
            })
        }
    }
}