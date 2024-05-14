package com.github.ricardoandredem.microgram.telegram.handlers

import android.util.Log
import org.drinkless.tdlib.Client

class LogMessageHandler : Client.LogMessageHandler {
    val tag: String = "TDLib"

    override fun onLogMessage(verbosityLevel: Int, message: String?) {
        if (verbosityLevel == 0) {
            Log.e(tag, message ?: "Error not especified by TDLib")
        }
        Log.i(tag, message ?: "Log not especified by TDLib")
    }

    // TODO talvez eu lide com erros depois
    //fun onFatalError(errorMessage: String)
}