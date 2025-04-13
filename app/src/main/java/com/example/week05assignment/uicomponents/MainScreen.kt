
import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.week05assignment.model.ImageData
import com.example.week05assignment.model.ImageListFactory
import com.example.week05assignment.uicomponents.CheckBoxRoom
import com.example.week05assignment.uicomponents.DressRoom

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var clothes by rememberSaveable(stateSaver = ImageData.saver) {
        mutableStateOf(ImageListFactory.makeImageList())
    }
    val orientation = LocalConfiguration.current.orientation

    val toggle: (ImageData) -> Unit = { selected ->
        clothes = ImageListAc.toggleClothSelection(selected, clothes)
    }

    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(130.dp)) {
            DressRoom(
                clothes = clothes,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth())
            CheckBoxRoom(
                clothes = clothes,
                onToggle = toggle,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth())
        }

    } else {
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(130.dp)) {
            DressRoom(
                clothes = clothes,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight())
            CheckBoxRoom(
                clothes = clothes,
                onToggle = toggle,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight())
        }
    }
}
