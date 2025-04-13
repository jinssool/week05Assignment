package com.example.week05assignment.model

import com.example.week05assignment.R

object ImageListFactory {
    fun makeImageList() = mutableListOf(

        ImageData(
            imageResId = R.drawable.arms.toString(),
            imagename = "arms",
        ),
        ImageData(
            imageResId = R.drawable.ears.toString(),
            imagename = "ears",
        ),
        ImageData(
            imageResId = R.drawable.eyebrows.toString(),
            imagename = "eyebrows",
        ),
        ImageData(
            imageResId = R.drawable.eyes.toString(),
            imagename = "eyes",
        ),
        ImageData(
            imageResId = R.drawable.glasses.toString(),
            imagename = "glasses",
        ),
        ImageData(
            imageResId = R.drawable.hat.toString(),
            imagename = "hat",
        ),
        ImageData(
            imageResId = R.drawable.mouth.toString(),
            imagename = "mouth",
        ),
        ImageData(
            imageResId = R.drawable.mustache.toString(),
            imagename = "mustache",
        ),
        ImageData(
            imageResId = R.drawable.nose.toString(),
            imagename = "nose",
        ),
        ImageData(
            imageResId = R.drawable.shoes.toString(),
            imagename = "shoes"
        )
    )
}