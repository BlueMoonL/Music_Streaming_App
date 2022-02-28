package com.bluemoonl.ch17musicstreamingapp.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("/v3/e5d81296-e676-4bad-a1e1-efcf0e2f4122")
    fun listMusics() : Call<MusicDto>
}