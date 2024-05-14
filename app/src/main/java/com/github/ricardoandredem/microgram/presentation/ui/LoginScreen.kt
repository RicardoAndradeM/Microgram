package com.github.ricardoandredem.microgram.presentation.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material.Text
import androidx.wear.tooling.preview.devices.WearDevices
import com.github.ricardoandredem.microgram.R
import com.github.ricardoandredem.microgram.presentation.theme.MicrogramTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    ScalingLazyColumn {
        item {
            Text(
                text = stringResource(id = R.string.enter_on_telegram),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
        item { Text(text = "- " + stringResource(id = R.string.first_login_instruction)) }
        item { Text(text = "- " + stringResource(id = R.string.second_login_instruction)) }
        item { Text(text = "- " + stringResource(id = R.string.third_login_instruction)) }
    }
}

@Preview(device = WearDevices.SMALL_ROUND, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    MicrogramTheme {
        LoginScreen()
    }
}