package com.amirhusseinSorri.motionlayoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.amirhusseinSorri.motionlayoutcompose.ui.theme.ColorMotionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorMotionTheme {
                    MotionLayoutDemo()
            }
        }

    }

}
