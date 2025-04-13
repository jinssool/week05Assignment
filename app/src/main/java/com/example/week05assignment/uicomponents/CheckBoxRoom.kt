package com.example.week05assignment.uicomponents

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.week05assignment.model.ImageData

@Composable
fun CheckBoxRoom(
    clothes : List<ImageData>,
    onToggle: (ImageData) -> Unit,
    modifier: Modifier = Modifier,
                 ) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
    ) {
        items(clothes) { item ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = item.isSelected,
                    onCheckedChange = { onToggle(item) }
                )
                Text(item.imagename)
            }
        }
    }
}