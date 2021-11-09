package com.amirhusseinSorri.motionlayoutcompose

import android.graphics.Paint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.MotionLayout
import androidx.compose.material.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.*


import com.amirhusseinSorri.motionlayoutcompose.ui.theme.*


@Composable
fun MotionLayoutDemo() {
    Column(Modifier) {
            Spacer(modifier = Modifier.height(0.dp))
            ColorMotion()
        }
}

@Composable
private fun ColorMotion() {
    var animateImage by rememberSaveable{ mutableStateOf(false) }
    var colorSurface by remember { mutableStateOf(Color.White) }
    var color by rememberSaveable { mutableStateOf(R.drawable.ic_lens) }
    val imageAnimationProgress by animateFloatAsState(
        targetValue = if (animateImage) 1f else 0f,
        animationSpec = tween(1750)
    )
    MotionColorSurface(modifier = Modifier.fillMaxSize(),color= colorSurface){
        Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            MotionLayout(
            ConstraintSet(
                """ {
                greenColor: { 
                  width: 70,
                  height: 70,
                  bottom: ['parent', 'top', 1000],
                  start: ['parent', 'start', 200]
                },
                grayColor: { 
                  width: 50,
                  height: 50,
                  end: ['parent', 'start', 200],
                  bottom: ['parent', 'top', 0],
                  
   
                },
                redColor: { 
                  width: 50,
                  height: 50,
                  top: ['parent', 'top', 1000],
                  start: ['parent', 'start', 200]
                },
                yellowColor: { 
                  width: 50,
                  height: 50,
                  start: ['parent', 'end', 200],
                  bottom: ['parent', 'top', 0]
                },
                 magentaColor: { 
                  width: 50,
                  height: 50,
                 end: ['parent', 'start', 200],
                  bottom: ['parent', 'top', 1000]
                },
                cyanColor: { 
                  width: 50,
                  height: 50,
                  end: ['parent', 'start', 200],
                  top: ['parent', 'bottom', 50]
   
                },
                blueColor: { 
                  width: 50,
                  height: 50,
                   start: ['parent', 'end', 200],
                  bottom: ['parent', 'top', 1000]
                  
                },
                blackColor: { 
                  width: 50,
                  height: 50,
                   start: ['parent', 'end', 200],
                  top: ['parent', 'bottom', 1000]
                },
                paintFab: {
                width: 50,
               height: 50,
                bottom: ['parent', 'bottom',10],
                end: ['parent', 'end',10]
}
            } """
            ),
            ConstraintSet(
                """ {
                greenColor: { 
                  width: 50,
                  height: 50,
                   bottom: ['paintFab', 'top', 40],
                  start: ['paintFab', 'start', 0],

                },
                grayColor: { 
                  width: 50,
                  height: 50,
                  end: ['paintFab', 'start', 40],
                  top: ['paintFab', 'top', 0]
                },
                redColor: { 
                  width: 50,
                  height: 50,
                 top: ['paintFab', 'bottom', 40],
                  start: ['paintFab', 'start', 0]
                },
                yellowColor: { 
                  width: 50,
                  height: 50,
                  start: ['paintFab', 'end', 40],
                  bottom: ['paintFab', 'bottom', 0]
                },
                magentaColor: { 
                  width: 50,
                  height: 50,
                  end: ['greenColor', 'start', 10],
                   top: ['greenColor', 'top', 35]
                },
                cyanColor: { 
                  width: 50,
                  height: 50,
                  start: ['magentaColor', 'start', 0],
                  top: ['magentaColor', 'bottom', 62]
                },
                blueColor: { 
                  width: 50,
                  height: 50,
                  start: ['greenColor', 'end', 10],
                  top: ['greenColor', 'top', 35]
                },
                blackColor: { 
                  width: 50,
                  height: 50,
                  start: ['blueColor', 'start', 0],
                  top: ['blueColor', 'bottom', 62]
                },
                paintFab: {
                width: 50,
                height: 50,
               top: ['parent', 'top'],
               start: ['parent','start'],
               end: ['parent','end'],
               bottom: ['parent','bottom',170]
                }
            } """
            ),
            progress = imageAnimationProgress,
            modifier = Modifier
                .fillMaxSize()

        ) {

            ColorItem(InputData.Green.data) {
                animateImage = !animateImage
                colorSurface = Green50
                color = changeBackFab(color)
            }
            ColorItem(InputData.Gray.data) {
                animateImage = !animateImage
                colorSurface= Gray50
                color = changeBackFab(color)
            }
            ColorItem(InputData.Red.data) {
                animateImage = !animateImage
                colorSurface = Red50
                color = changeBackFab(color)
            }
            ColorItem(InputData.Yellow.data) {
                animateImage = !animateImage
                colorSurface = Yellow50
                color = changeBackFab(color)
            }
            ColorItem(InputData.Pink.data) {
                animateImage = !animateImage
                colorSurface = Magenta50
                color = changeBackFab(color)
            }
            ColorItem(InputData.Cyan.data) {
                animateImage = !animateImage
                colorSurface = Cyan50
                color = changeBackFab(color)
            }
            ColorItem(InputData.Blue.data) {
                animateImage = !animateImage
                colorSurface = Blue50
                color = changeBackFab(color)
            }
            ColorItem(InputData.Black.data) {
                animateImage = !animateImage
                colorSurface = Black50
                color = changeBackFab(color)
            }


            FloatingActionButton(
                onClick = {
                    animateImage = !animateImage
                    color = if (color == R.drawable.ic_lens) {
                        R.drawable.ic_close
                    } else {
                        R.drawable.ic_lens
                    }
                },
                modifier = Modifier
                    .padding(2.dp)
                    .size(25.dp)
                    .layoutId("paintFab"),
                backgroundColor = Red800,
                contentColor = Color.White,
            ) {
                Icon(painter = painterResource(color), "empty_screen") }
        }
     }
        }


}

@Composable
fun ColorItem(data:DetailsOfTheme, setAnime: () -> Unit) {
    Canvas(modifier = Modifier
        .width(100.dp)
        .height(100.dp)
        .layoutId(data.id)
        .clickable {
            setAnime()
        }) {

        drawCircle(
            color = data.color,
            radius = size.minDimension / 2
        )
        drawContext.canvas.nativeCanvas.drawText(
            data
                .text,
            size.width / 2f,
            size.height / 1.7f,
            Paint().apply {
                textAlign = Paint.Align.CENTER
                textSize = 30f
                color = Color.White.toArgb()
            })
    }


}

fun changeBackFab(color:Int):Int{
    return if (color == R.drawable.ic_lens) {
        R.drawable.ic_close
    } else {
        R.drawable.ic_lens
    }
}
