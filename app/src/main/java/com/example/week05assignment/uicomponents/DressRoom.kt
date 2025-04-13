package com.example.week05assignment.uicomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.week05assignment.R
import com.example.week05assignment.model.ImageData

@Composable
fun DressRoom(clothes : List<ImageData>, modifier: Modifier = Modifier) {
    Box(modifier = Modifier){
        Image(
            painter = painterResource(id = R.drawable.body),
            contentDescription = "body",
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.5f)
        )
        clothes
            .filter { it.isSelected }
            .forEach{
            Image(
                painterResource(id = it.imageResId.toInt()),
                contentDescription = it.imagename,
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth(0.5f)
            )
        }
    }

}