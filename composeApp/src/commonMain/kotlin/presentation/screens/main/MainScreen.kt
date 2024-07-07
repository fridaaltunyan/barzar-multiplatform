package presentation.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import barzar.composeapp.generated.resources.Res
import barzar.composeapp.generated.resources.ic_game_rules
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "BarZar")
            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0x1F0B82),
                                Color(0x86453A)
                            )
                        ),
                        shape = RoundedCornerShape(15.dp)
                    )
            ) {
                Button(modifier = Modifier
                    .height(50.dp),
                    onClick = { }) {
                    Text(
                        modifier = Modifier
                            .padding(8.dp),
                        text = "Խաղալ",
                        maxLines = 2,
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.titleSmall,
                    )
                }
            }
        }
        Image(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp),
            painter = painterResource(Res.drawable.ic_game_rules),
            contentDescription = "rules"
        )
    }
}


@Preview
@Composable
fun MainPreview() {
    MainScreen()
}