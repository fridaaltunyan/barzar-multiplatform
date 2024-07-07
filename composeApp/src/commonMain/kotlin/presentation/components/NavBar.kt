package presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import barzar.composeapp.generated.resources.Res
import barzar.composeapp.generated.resources.ic_game_rules
import barzar.composeapp.generated.resources.ic_nav_back
import org.jetbrains.compose.resources.painterResource

@Composable
fun MainNavBar() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /* TODO: Handle click */ },
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(Res.drawable.ic_nav_back),
                    contentDescription = "Navigate back"
                )
            }

            Button(
                onClick = { /* TODO: Handle click */ },
                modifier = Modifier.padding(end = 16.dp)
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(Res.drawable.ic_game_rules),
                    contentDescription = "game rules"
                )
            }
        }
    }
}