package run.victor.kotlin.kalaha.service

import org.springframework.stereotype.Service
import run.victor.kotlin.kalaha.model.Game
import run.victor.kotlin.kalaha.repository.GameRepository

@Service
class GameService(val gameRepository: GameRepository) {

    fun createGame(winner: String): MutableList<Game> {

        val game = Game( "","board1", winner, "2")
        var save = gameRepository.save(game)

        return gameRepository.findAll()
    }

}
