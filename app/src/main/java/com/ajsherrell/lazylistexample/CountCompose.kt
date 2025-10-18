package com.ajsherrell.lazylistexample

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CountByStepsList(step: Int, modifier: Modifier = Modifier) {
    val countBySteps = CountBySteps(step)
    val listState = rememberLazyListState()
    LazyColumn(
        state = listState,
        modifier = modifier.padding(16.dp)
    ) {
        items(countBySteps.toList()) { number ->
            Text(text = number.toString())
        }
    }
}

