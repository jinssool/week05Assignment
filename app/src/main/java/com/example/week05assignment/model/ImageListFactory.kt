package com.example.week05assignment.model

import com.example.week05assignment.R

object ImageListFactory {
    fun makeImageList() = mutableListOf(

        ImageData(
            imageResId = R.drawable.arms.toInt(),
            imagename = "arms",
        ),
        ImageData(
            imageResId = R.drawable.ears.toInt(),
            imagename = "ears",
        ),
        ImageData(
            imageResId = R.drawable.eyebrows.toInt(),
            imagename = "eyebrows",
        ),
        ImageData(
            imageResId = R.drawable.eyes.toInt(),
            imagename = "eyes",
        ),
        ImageData(
            imageResId = R.drawable.glasses.toInt(),
            imagename = "glasses",
        ),
        ImageData(
            imageResId = R.drawable.hat.toInt(),
            imagename = "hat",
        ),
        ImageData(
            imageResId = R.drawable.mouth.toInt(),
            imagename = "mouth",
        ),
        ImageData(
            imageResId = R.drawable.mustache.toInt(),
            imagename = "mustache",
        ),
        ImageData(
            imageResId = R.drawable.nose.toInt(),
            imagename = "nose",
        ),
        ImageData(
            imageResId = R.drawable.shoes.toInt(),
            imagename = "shoes"
        )
    )
}