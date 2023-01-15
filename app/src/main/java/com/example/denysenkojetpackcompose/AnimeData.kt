package com.example.denysenkojetpackcompose

import androidx.lifecycle.ViewModel
import com.example.denysenkojetpackcompose.model.Anime
import kotlinx.coroutines.flow.MutableStateFlow

class AnimeData: ViewModel() {
    private val _anime = MutableStateFlow<List<Anime>>(emptyList())
    val anime = _anime

    fun getById(id: String): Anime {
        return _anime.value.filter { it.id == id }.first()
    }

    init {
        _anime.value = mutableListOf(
            Anime(
                "1",
                "Death Note",
                "Madhouse",
                R.drawable.death_note,
                2007,
                "Japanese",
                "Death Note (stylized in all caps) is a Japanese manga " +
                        "series written by Tsugumi Ohba and illustrated by Takeshi Obata. It was serialized in " +
                        "Shueisha's shōnen manga magazine Weekly Shōnen Jump from December 2003 to May 2006, with " +
                        "its 108 chapters collected " +
                        "in 12 tankōbon volumes. The story follows Light Yagami, a teen genius who discovers a mysterious notebook: " +
                        "the \"Death Note\", which belonged to the shinigami Ryuk, and grants the user the supernatural ability to kill " +
                        "anyone whose name is written in its pages. The series centers around Light's subsequent attempts to use the Death Note" +
                        " to carry out a worldwide massacre of individuals whom he deems immoral and to create a crime-free society, using the alias " +
                        "of a god-like vigilante named \"Kira\", and the subsequent efforts of an elite Japanese police task force, led by enigmatic detective " +
                        "L, to apprehend him."
            ),
            Anime(
                "2",
                "Fire force",
                "Atsushi Ohkubo",
                R.drawable.fire_force,
                2004,
                "Japanese",
                "Fire Force (Japanese: 炎炎ノ消防隊, Hepburn: En'en no Shōbōtai, lit. \"Blazing Fire Brigade\") is a Japanese manga series written and illustrated by Atsushi Ohkubo. It was serialized in Kodansha's shōnen manga magazine Weekly Shōnen Magazine from September 2015 to February 2022, with its chapters collected in thirty-four tankōbon volumes. In North America, the manga has been licensed for English language release by Kodansha USA."
            ),
            Anime(
                "3",
                "attack on titan",
                "Wit Studio",
                R.drawable.titans,
                2004,
                "Japanese",
                "Attack on Titan (Japanese: 進撃の巨人, Hepburn: Shingeki no Kyojin, lit. 'The Advancing Giant') is a Japanese manga series written and illustrated by Hajime Isayama. It is set in a world where humanity is forced to live in cities surrounded by three enormous walls that protect them from gigantic man-eating humanoids referred to as Titans; the story follows Eren Yeager, who vows to exterminate the Titans after they bring about the destruction of his hometown and the death of his mother. Attack on Titan was serialized in Kodansha's monthly shōnen manga magazine Bessatsu Shōnen Magazine from September 2009 to April 2021, with its chapters collected in 34 tankōbon volumes."
            ),
            Anime(
                "4",
                "Boku no pico",
                "OVA",
                R.drawable.img_1,
                2002,
                "Japanese",
                "Some des"
            ),
            Anime(
                "1",
                "Death Note",
                "Madhouse",
                R.drawable.death_note,
                2007,
                "Japanese",
                "Some des"
            ),
            Anime(
                "2",
                "Fire force",
                "Atsushi Ohkubo",
                R.drawable.fire_force,
                2004,
                "Japanese",
                "Some des"
            ),
            Anime(
                "3",
                "attack on titan",
                "Wit Studio",
                R.drawable.titans,
                2004,
                "Japanese",
                "Some des"
            ),
            Anime(
                "4",
                "Boku no pico",
                "OVA",
                R.drawable.img_1,
                2002,
                "Japanese",
                "Some des"
            )
        )
    }
}