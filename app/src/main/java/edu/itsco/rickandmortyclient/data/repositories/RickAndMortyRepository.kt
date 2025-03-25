package edu.itsco.rickandmortyclient.data.repositories

import edu.itsco.rickandmortyclient.data.api.RickAndMortyApi
import edu.itsco.rickandmortyclient.data.api.models.Characters
import javax.inject.Inject

class RickAndMortyRepository @Inject constructor(
    private val rickAndMortyApi: RickAndMortyApi
){
    suspend fun getAllCharacters(): Characters{
        return rickAndMortyApi.getAllCharacters()
    }
}