package edu.itsco.rickandmortyclient.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import edu.itsco.rickandmortyclient.data.api.models.Character
import edu.itsco.rickandmortyclient.data.api.models.Location
import edu.itsco.rickandmortyclient.data.api.models.Origin
import org.jetbrains.annotations.Async

@Composable
fun CardCharacter(
    character: Character,
    modifier: Modifier = Modifier){
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = modifier.padding(16.dp)
    ) {
        Row(
            modifier = modifier.fillMaxWidth()
        ){
            AsyncImage(
                model = character.image,
                contentDescription = character.name,
                contentScale = ContentScale.FillBounds,
                modifier = modifier.height(120.dp).width(120.dp)
            )

                Column(
                    modifier = modifier.weight(1f).padding(8.dp)
                ) {
                    Text(
                        character.name,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text("${character.status} - ${character.species}")
                }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardCharacter(){
    val character = Character(
        name = "Rick",
        status = "Alive",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
        created = "",
        episode = emptyList<String>(),
        id = 1,
        location = Location("",""),
        origin = Origin("",""),
        gender = "",
        url = "",
        type = ""
    )
    CardCharacter(character)
}


