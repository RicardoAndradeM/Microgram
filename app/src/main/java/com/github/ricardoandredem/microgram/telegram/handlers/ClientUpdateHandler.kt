package com.github.ricardoandredem.microgram.telegram.handlers

import com.github.ricardoandredem.microgram.telegram.services.AuthorizationService
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi

class ClientUpdateHandler(databasePath: String): Client.ResultHandler {
    private val authorizationService: AuthorizationService = AuthorizationService(
        databasePath = databasePath
    )

    override fun onResult(update: TdApi.Object?) {
        if(update != null) {
            when(update.constructor) {
                TdApi.UpdateAuthorizationState.CONSTRUCTOR -> {
                    authorizationService.onAuthorizationState(update as TdApi.AuthorizationState)
                }
            }
        }
    }
}