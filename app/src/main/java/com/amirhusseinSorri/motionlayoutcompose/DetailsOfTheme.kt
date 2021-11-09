package com.amirhusseinSorri.motionlayoutcompose



import androidx.compose.ui.graphics.*
import com.amirhusseinSorri.motionlayoutcompose.ui.theme.Yellow800
import java.io.Serializable

data class DetailsOfTheme(
    val color: Color,
    val id: String,
    val text:String
) : Serializable

sealed class InputData(var data:DetailsOfTheme){
    object Green:InputData(DetailsOfTheme(Color.Green,"greenColor","green"))
    object Gray:InputData(DetailsOfTheme(Color.Gray,"grayColor","gray"))
    object Red:InputData(DetailsOfTheme(Color.Red,"redColor","red"))
    object Yellow:InputData(DetailsOfTheme(Yellow800,"yellowColor","yellow"))
    object Pink:InputData(DetailsOfTheme(Color.Magenta,"magentaColor","pink"))
    object Cyan:InputData(DetailsOfTheme(Color.Cyan,"cyanColor","cyan"))
    object Blue:InputData(DetailsOfTheme(Color.Blue,"blueColor","blue"))
    object Black:InputData(DetailsOfTheme(Color.Black,"blackColor","black"))

}