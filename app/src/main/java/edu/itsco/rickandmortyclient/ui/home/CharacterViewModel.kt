package edu.itsco.rickandmortyclient.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.itsco.rickandmortyclient.data.api.models.Character
import edu.itsco.rickandmortyclient.data.repositories.RickAndMortyRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val rickAndMortyRepository: RickAndMortyRepository
): ViewModel() {

    private val _state = MutableStateFlow(emptyList<Character>())

    val state: StateFlow<List<Character>>
        get() = _state

    init{
        viewModelScope.launch {
            _state.value = rickAndMortyRepository.getAllCharacters().results
        }
    }
}