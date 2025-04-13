package com.example.week05assignment.model

import androidx.compose.runtime.saveable.listSaver

data class ImageData(
    val imageResId: Int,
    val imagename: String,
    var isSelected: Boolean = false,
) {
    companion object {
        val saver = listSaver<List<ImageData>, Any>(
            save = { list ->
                list.map {
                    listOf(it.imageResId, it.imagename, it.isSelected)
                }

            },
            restore = { saved ->
                (saved as List<List<Any>>).map {
                    ImageData(
                        imageResId = it[0] as Int,
                        imagename = it[1] as String,
                        isSelected = it[2] as Boolean
                    )
                }
            })

    }
}
