package edu.itsco.rickandmortyclient.data.api

import edu.itsco.rickandmortyclient.data.api.models.Characters
import retrofit2.http.GET

interface RickAndMortyApi {

    @GET("character")
    suspend fun getAllCharacters(): Characters
}