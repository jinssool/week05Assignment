import androidx.compose.runtime.saveable.listSaver
import com.example.week05assignment.model.ImageData
import kotlin.collections.map

object ImageListAc {
    fun toggleClothSelection(selected: ImageData, list: List<ImageData>): List<ImageData> {
        return list.map {
            if (it == selected) it.copy(isSelected = !it.isSelected)
            else it
        }
    }

    val saver = listSaver<List<ImageData>, Any>(
        save = { list ->
            list.map {
                listOf(it.imageResId, it.imagename, it.isSelected)
            }.flatten()
        },
        restore = { flatList ->
            flatList.chunked(4).map { chunk ->
                ImageData(
                    imageResId = chunk[0] as Int,
                    imagename = chunk[1] as String,
                    isSelected = chunk[2] as Boolean,
                )
            }
        }
    )
}
