package presentation.screens.groups

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import presentation.components.MainNavBar
import presentation.components.PointComponent
import presentation.components.TimeComponent

@Composable
fun GroupsScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        MainNavBar()
        Spacer(
            modifier = Modifier.height(
                16.dp
            )
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TimeComponent()
            Spacer(modifier = Modifier.width(16.dp))
            PointComponent()
        }
        Spacer(modifier = Modifier.height(16.dp))
        Groups()
        Spacer(modifier = Modifier.height(16.dp))
        Button(modifier = Modifier
            .height(50.dp),
            onClick = { }) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Սկսել",
                maxLines = 2,
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}
