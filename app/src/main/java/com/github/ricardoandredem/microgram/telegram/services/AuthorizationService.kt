package com.github.ricardoandredem.microgram.telegram.services

import com.github.ricardoandredem.microgram.model.MicrogramData
import org.drinkless.tdlib.TdApi

class AuthorizationService(private val databasePath: String) {
    fun onAuthorizationState(authorizationState: TdApi.AuthorizationState) {
        MicrogramData.authorizationState = authorizationState
        when(MicrogramData.authorizationState.constructor) {
            TdApi.AuthorizationStateWaitTdlibParameters.CONSTRUCTOR -> {
                val parameters: TdApi.SetTdlibParameters = TdApi.SetTdlibParameters()
                parameters.databaseDirectory = databasePath
                parameters.useMessageDatabase = true
                parameters.useSecretChats =  false
                //parameters.apiId = // colocar apiID
                //parameters.apiHash = // colocar apihash
                parameters.systemLanguageCode = "en" // pegar idioma do sistema
                parameters.deviceModel = "Android Wear" //verificar depois
                parameters.applicationVersion = "0.1"
            }

            TdApi.AuthorizationStateWaitPhoneNumber.CONSTRUCTOR,
            TdApi.AuthorizationStateWaitCode.CONSTRUCTOR,
            TdApi.AuthorizationStateWaitRegistration.CONSTRUCTOR -> {
                TODO()
            }

            TdApi.AuthorizationStateWaitOtherDeviceConfirmation.CONSTRUCTOR -> {
                TODO()
            }

            TdApi.AuthorizationStateWaitPassword.CONSTRUCTOR -> {
                TODO()
            }

            TdApi.AuthorizationStateReady.CONSTRUCTOR -> {
                TODO()
            }

            TdApi.AuthorizationStateClosing.CONSTRUCTOR -> {
                TODO()
            }

            TdApi.AuthorizationStateClosed.CONSTRUCTOR -> {
                TODO()
            }

            TdApi.AuthorizationStateLoggingOut.CONSTRUCTOR -> {
                TODO()
            }

            TdApi.AuthorizationStateWaitEmailAddress.CONSTRUCTOR -> {} // TODO

            TdApi.AuthorizationStateWaitEmailCode.CONSTRUCTOR -> { } // TODO
        }
    }
}