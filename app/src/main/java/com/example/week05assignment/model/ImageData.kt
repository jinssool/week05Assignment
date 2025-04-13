package com.example.week05assignment.model

import androidx.compose.runtime.saveable.listSaver

data class ImageData(
    val imageResId : String,
    val imagename : String,
    var isSelected : Boolean = false,
) {
    companion object{
        val saver = listSaver<ImageData, Any>(
            save = { item ->
                listOf(item.imageResId,item.imagename,item.isSelected)
            },
            restore = {list ->
                ImageData(
                    imageResId = list[0] as String,
                    imagename = list[1] as String,
                    isSelected = list[2] as Boolean,
                    )
            }
        )
    }
}

