
import com.example.week05assignment.model.ImageData

object ImageListAc {
    fun toggleClothSelection(selected: ImageData, list: List<ImageData>): List<ImageData> {
        return list.map {
            if (it == selected) it.copy(isSelected = !it.isSelected)
            else it
        }
    }


}
