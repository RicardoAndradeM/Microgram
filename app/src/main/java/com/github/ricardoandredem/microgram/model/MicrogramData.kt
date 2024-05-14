package com.github.ricardoandredem.microgram.model

import org.drinkless.tdlib.TdApi

object MicrogramData {
    lateinit var authorizationState: TdApi.AuthorizationState
    lateinit var databasePath: String
}