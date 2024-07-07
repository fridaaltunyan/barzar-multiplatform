package presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import barzar.composeapp.generated.resources.Res
import barzar.composeapp.generated.resources.ic_time
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TimerBox() {
    Box(
        modifier = Modifier.width(width = 100.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color.Red)
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "text")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "text")
        }
    }
}

@Composable
fun GroupTimePointBackgroundComponent(
    imageRes: DrawableResource,
    text: String,
    content: @Composable() () -> Unit
) {
    Box(
        modifier = Modifier.border(
            width = 1.dp,
            color = Color.DarkGray,
            shape = RoundedCornerShape(10.dp)
        ).width(125.dp)
    ) {
        Text(modifier = Modifier.align(Alignment.TopCenter), text = text)
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = "Top Start Image",
                modifier = Modifier.size(25.dp).padding(start = 16.dp)
            )

            OutlinedTextField(
                value = "01:00",
                onValueChange = {},
                label = { Text("Label") },
                modifier = Modifier
                    .padding(end = 8.dp)
                    .weight(1f)
            )
        }
    }
}

@Composable
fun TimeComponent() {
    Box(
        modifier = Modifier.border(
            width = 1.dp,
            color = Color.DarkGray,
            shape = RoundedCornerShape(10.dp)
        ).width(125.dp)
    ) {
        Text(modifier = Modifier.align(Alignment.TopCenter), text = "Ժամանակ")
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(Res.drawable.ic_time),
                contentDescription = "Top Start Image",
                modifier = Modifier.size(40.dp).padding(start = 16.dp)
            )

            OutlinedTextField(
                value = "01:00",
                onValueChange = {},
                label = { Text("Label") },
                modifier = Modifier
                    .padding(end = 8.dp)
                    .weight(1f)
            )
        }
    }
}

@Preview
@Composable
fun TimerBoxPreview() {
    TimerBox()
}