package com.example.week05assignment.uicomponents

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import com.example.week05assignment.model.ImageData
import com.example.week05assignment.model.ImageListFactory

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var clothes by rememberSaveable(stateSaver = ImageListAc.saver) {
        mutableStateOf(ImageListFactory.makeImageList())
    }

    val orientation = LocalConfiguration.current.orientation

    val toggle: (ImageData) -> Unit = { selected ->
        clothes = ImageListAc.toggleClothSelection(selected, clothes).toMutableList()
    }


    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        Column(modifier = Modifier.fillMaxSize()) {
            DressRoom(clothes = clothes, modifier = Modifier.weight(1f))
            CheckBoxRoom(clothes = clothes, onToggle = toggle, modifier = Modifier.weight(1f))
        }

    } else {
        Row(modifier = Modifier.fillMaxSize()) {
            DressRoom(clothes = clothes, modifier = Modifier.weight(1f))
            CheckBoxRoom(clothes = clothes, onToggle = toggle, modifier = Modifier.weight(1f))
        }


    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}