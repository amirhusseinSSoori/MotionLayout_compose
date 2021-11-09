package com.amirhusseinSorri.motionlayoutcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


// dark palettes
private val DarkWhiteColorPalette = darkColors(
    primary = White,
    primaryVariant = White,
    secondary = teal200,
    background = Color.Green,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)
private val DarkGreenColorPalette = darkColors(
    primary = green700,
    primaryVariant = green700,
    secondary = teal200,
    background = Color.Green,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)

private val DarkGrayColorPalette = darkColors(
    primary = Color.Gray,
    primaryVariant = Color.Gray,
    secondary = teal200,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)

private val DarkBlueColorPalette = darkColors(
    primary = Color.Blue,
    primaryVariant = blue700,
    secondary = teal200,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)

private val DarkRedColorPalette = darkColors(
    primary = Red,
    primaryVariant = Red,
    secondary = teal200,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)

private val DarkYellowColorPalette = darkColors(
    primary = Yellow800,
    primaryVariant = Yellow800,
    secondary = teal200,
    background = Color.Green,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)

private val DarkPinkColorPalette = darkColors(
    primary = Color.Magenta,
    primaryVariant = Color.Magenta,
    secondary = teal200,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)

private val DarkCyanColorPalette = darkColors(
    primary = Color.Cyan,
    primaryVariant = Color.Cyan,
    secondary = teal200,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)

private val DarkBlackColorPalette = darkColors(
    primary = Black,
    primaryVariant = Black,
    secondary = Color.White,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)


// Light pallets
private val LightWhiteColorPalette = lightColors(
    primary = White,
    primaryVariant = White,
    secondary = Color.White,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)
private val LightGreenColorPalette = lightColors(
    primary = green700,
    primaryVariant = green700,
    secondary = teal200,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val LightGrayColorPalette = lightColors(
    primary = Gray50,
    primaryVariant = Gray50,
    secondary = teal200,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val LightBlueColorPalette = lightColors(
    primary = blue700,
    primaryVariant = blue700,
    secondary = teal200,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val LightRedColorPalette = lightColors(
    primary = Red,
    primaryVariant = Red,
    secondary = teal200,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)
private val LightYellowColorPalette = lightColors(
    primary = Yellow800,
    primaryVariant = Yellow800,
    secondary = Color.Black,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Magenta,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val LightPinkColorPalette = lightColors(
    primary = Color.Magenta,
    primaryVariant = Color.Magenta,
    secondary = teal200,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val LightCyanColorPalette = lightColors(
    primary = Color.Cyan,
    primaryVariant = Color.Cyan,
    secondary = teal200,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val LightBlackColorPalette = lightColors(
    primary = Color.Black,
    primaryVariant = Black,
    secondary = Color.White,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)




enum class ColorPallet {
    WHITE,GREEN,BLUE,GRAY,RED,YELLOW,PINK,CYAN,BLACK
}

@Composable
fun ColorMotionTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    colorPallet: ColorPallet = ColorPallet.GREEN,
    content: @Composable () -> Unit,
) {
    val colors = when (colorPallet) {
        ColorPallet.WHITE -> if (darkTheme) DarkWhiteColorPalette else LightWhiteColorPalette
        ColorPallet.GREEN -> if (darkTheme) DarkGreenColorPalette else LightGreenColorPalette
        ColorPallet.BLUE -> if (darkTheme) DarkBlueColorPalette else LightBlueColorPalette
        ColorPallet.GRAY -> if (darkTheme) DarkGrayColorPalette else LightGrayColorPalette
        ColorPallet.RED -> if (darkTheme) DarkRedColorPalette else LightRedColorPalette
        ColorPallet.YELLOW -> if (darkTheme) DarkYellowColorPalette else LightYellowColorPalette
        ColorPallet.PINK -> if (darkTheme) DarkPinkColorPalette else LightPinkColorPalette
        ColorPallet.CYAN -> if (darkTheme) DarkCyanColorPalette else LightCyanColorPalette
        ColorPallet.BLACK -> if (darkTheme) DarkBlackColorPalette else LightBlackColorPalette
        else ->  if (darkTheme) LightGreenColorPalette else LightBlueColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
