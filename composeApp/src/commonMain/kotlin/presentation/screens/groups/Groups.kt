package presentation.screens.groups

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import barzar.composeapp.generated.resources.Res
import barzar.composeapp.generated.resources.ic_add_group
import org.jetbrains.compose.resources.painterResource

@Composable
fun Groups() {
    Box(
        modifier = Modifier.border(
            width = 1.dp,
            color = Color.DarkGray,
            shape = RoundedCornerShape(10.dp)
        )
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth().align(Alignment.Center),
            contentPadding = PaddingValues(16.dp)) {
            items(listOf(
                GroupItem("Թիմ 1"),
                GroupItem("Թիմ 2"))) { groupItem ->
                GroupItemView(groupItem)
            }
        }
        Button(
            onClick = { /* TODO: Handle click */ },
            modifier = Modifier.padding(start = 16.dp).align(Alignment.TopStart)
        ) {
            Image(
                modifier = Modifier.size(30.dp),
                painter = painterResource(Res.drawable.ic_add_group),
                contentDescription = "Navigate back"
            )
        }
    }

}

@Composable
fun GroupItemView(groupItem: GroupItem) {
    Text(
        text = groupItem.name,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.padding(8.dp)
    )
}

data class GroupItem(
    val name: String,
)