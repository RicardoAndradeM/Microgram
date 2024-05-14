package com.github.ricardoandredem.microgram.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Done
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import androidx.wear.tooling.preview.devices.WearDevices
import com.github.ricardoandredem.microgram.R
import com.github.ricardoandredem.microgram.presentation.theme.MicrogramTheme

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.app_logo),
            contentDescription = null,
            modifier = Modifier.size(75.dp)
                .clip(RoundedCornerShape(40.dp))
        )
        Text(
            text = stringResource(id = R.string.slogan),
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Button(onClick = { /*TODO*/ }) {
            Icon(Icons.Rounded.Done, contentDescription = "Next Screen")
        }
    }
}

@Preview(device = WearDevices.SMALL_ROUND, showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    MicrogramTheme {
        WelcomeScreen()
    }
}