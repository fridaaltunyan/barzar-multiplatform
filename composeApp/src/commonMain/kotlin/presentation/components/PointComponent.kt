package presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.text2.BasicTextField2
import androidx.compose.foundation.text2.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import barzar.composeapp.generated.resources.Res
import barzar.composeapp.generated.resources.ic_cup
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PointComponent() {
    Box(
        modifier = Modifier.border(
            width = 1.dp,
            color = Color.DarkGray,
            shape = RoundedCornerShape(10.dp)
        ).width(125.dp)
    ) {
        Text(modifier = Modifier.align(Alignment.TopCenter), text = "Միավոր")
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(Res.drawable.ic_cup),
                contentDescription = "Top Start Image",
                modifier = Modifier.size(40.dp).padding(start = 16.dp)
            )

            val point = rememberTextFieldState("30")
            // TODO: Change into spinner
            BasicTextField2(
                state = point,
                modifier = Modifier
                    .padding(12.dp)
                    .weight(1f)
            )
        }
    }
}