package com.example.week05assignment.uicomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.week05assignment.model.ImageData

@Composable
fun DressRoom(clothes : List<ImageData>) {
    Box(modifier = Modifier.fillMaxSize()){
        clothes
            .filter { it.isSelected }
            .forEach{
            Image(
                painterResource(id = it.imageResId.toInt()),
                contentDescription = it.imagename,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }

}