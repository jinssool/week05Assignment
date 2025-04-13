package com.example.week05assignment.model

object ImageListAc {
    fun toggleClothSelection(selected: ImageData, list: MutableList<ImageData>): List<ImageData> {
        return list.map {
            if (it == selected) it.copy(isSelected = !it.isSelected)
            else it
        }
    }
}