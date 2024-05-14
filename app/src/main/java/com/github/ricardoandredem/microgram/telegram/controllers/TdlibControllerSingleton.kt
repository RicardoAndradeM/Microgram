package com.github.ricardoandredem.microgram.telegram.controllers

import com.github.ricardoandredem.microgram.presentation.ui.MicrogramViewModel

object TdlibControllerSingleton {
    private lateinit var controller: TdlibController

    fun getController(viewModel: MicrogramViewModel): TdlibController {
        if (!::controller.isInitialized) {
            controller = TdlibController(viewModel)
        } else {
            controller.viewModel = viewModel
        }
        return controller
    }
}