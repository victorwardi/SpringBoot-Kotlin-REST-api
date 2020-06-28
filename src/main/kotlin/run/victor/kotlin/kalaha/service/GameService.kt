package run.victor.kotlin.kalaha.service

import org.springframework.stereotype.Service
import run.victor.kotlin.kalaha.dto.GameDTO
import run.victor.kotlin.kalaha.model.Game
import run.victor.kotlin.kalaha.model.Player
import run.victor.kotlin.kalaha.repository.GameRepository

@Service
class GameService(val gameRepository: GameRepository) {

    fun createGame(gameDTO: GameDTO): Game {

        val firstPlayer = Player(gameDTO.firstPlayerName)
        val secondPlayer = Player(gameDTO.secondPlayerName)

        val game = Game(firstPlayer, secondPlayer)

        return gameRepository.save(game);
    }

}
