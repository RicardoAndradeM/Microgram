package com.github.ricardoandredem.microgram.telegram.controllers

import com.github.ricardoandredem.microgram.presentation.ui.MicrogramViewModel
import com.github.ricardoandredem.microgram.telegram.handlers.LogMessageHandler
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import org.drinkless.tdlib.TdApi.LogStreamEmpty

class TdlibController(var viewModel: MicrogramViewModel) {
    var client: Client? = null // mudar para lateinit

    init {
        Client.setLogMessageHandler(0, LogMessageHandler())

        try { // TODO talvez eu lide com logs depois
            Client.execute(TdApi.SetLogVerbosityLevel(0))
            Client.execute(
                TdApi.SetLogStream(LogStreamEmpty())
            )
        } catch (ignored: Client.ExecutionException) {}

        //client = Client.create()
    }

    private fun getViewModelInstace(): MicrogramViewModel {
        return viewModel
    }
}