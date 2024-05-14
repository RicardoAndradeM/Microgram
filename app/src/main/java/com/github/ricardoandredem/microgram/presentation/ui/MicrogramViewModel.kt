package com.github.ricardoandredem.microgram.presentation.ui

import androidx.lifecycle.ViewModel
import com.github.ricardoandredem.microgram.telegram.controllers.TdlibController
import com.github.ricardoandredem.microgram.telegram.controllers.TdlibControllerSingleton

class MicrogramViewModel : ViewModel() {
    private val controller: TdlibController = TdlibControllerSingleton.getController(this)
}