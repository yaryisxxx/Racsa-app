package com.optic.racsaapp.providers

import com.optic.racsaapp.api.IFCMApi
import com.optic.racsaapp.api.RetrofitClient
import com.optic.racsaapp.models.FCMBody
import com.optic.racsaapp.models.FCMResponse
import retrofit2.Call

class NotificationProvider {

    private val URL = "https://fcm.googleapis.com"

    fun sendNotification(body: FCMBody): Call<FCMResponse> {
        return RetrofitClient.getClient(URL).create(IFCMApi::class.java).send(body)
    }

}