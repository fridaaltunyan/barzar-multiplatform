package com.fridaaltunyan.barzar.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import barzar.composeapp.generated.resources.Res
import barzar.composeapp.generated.resources.finish_game
import org.jetbrains.compose.resources.stringResource

@Composable
fun FinishGameButton(
    modifier: Modifier = Modifier
) {
    val gradient =
        remember {
            Brush.horizontalGradient(
            listOf(
                Color(0x1F0B82),
            Color(0x86453A)
            )) }
    Button(
        onClick = { /* TODO: Handle click */ },
        modifier = modifier.padding(bottom = 16.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        elevation = null,
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .then(modifier),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = stringResource(Res.string.finish_game))
        }
    }
}