package run.victor.kotlin.kalaha.model


import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document
import run.victor.kotlin.kalaha.enums.TurnOf
import run.victor.kotlin.kalaha.enums.Winner
import kotlin.random.Random

@Document
@TypeAlias("Game")
 data class Game(val firstPlayer: Player, val secondPlayer: Player) {
          @Id
          var id: String? = null
          var winner = Winner.NOT_AVAILABLE.id
          var turnOfWithId = TurnOf.FIRST_PLAYER.id

    override fun toString(): String {
        return "Game(firstPlayer=$firstPlayer, secondPlayer=$secondPlayer, id='$id', winner='$winner', turnOfWithId='$turnOfWithId')"
    }


}