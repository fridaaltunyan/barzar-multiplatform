package com.fridaaltunyan.barzar.presentation.screens.choice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import barzar.composeapp.generated.resources.Res
import barzar.composeapp.generated.resources.ic_alias
import barzar.composeapp.generated.resources.ic_pantome
import barzar.composeapp.generated.resources.ic_reverse
import barzar.composeapp.generated.resources.ic_yes_no
import com.fridaaltunyan.barzar.presentation.components.MainNavBar
import org.jetbrains.compose.resources.painterResource

@Composable
fun ChoiceScreen() {

    val images = remember {
        listOf(
            Res.drawable.ic_alias,
            Res.drawable.ic_pantome,
            Res.drawable.ic_reverse,
            Res.drawable.ic_yes_no,
            Res.drawable.ic_yes_no,
        )
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MainNavBar()
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(images) { item ->
                Image(painter = painterResource(resource = item), contentDescription = "")
            }
        }
    }
}