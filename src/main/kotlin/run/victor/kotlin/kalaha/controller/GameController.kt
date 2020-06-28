package run.victor.kotlin.kalaha.controller

import org.springframework.web.bind.annotation.*
import run.victor.kotlin.kalaha.dto.GameDTO
import run.victor.kotlin.kalaha.model.Game
import run.victor.kotlin.kalaha.service.GameService

/**
 *
 *
 * @author Victor Wardi - @victorwardi
 *
 */

@RestController
@RequestMapping("/game")
class GameController {

    var gameService: GameService

    constructor(gameService: GameService) {
        this.gameService = gameService
    }

    @PostMapping
    fun createGame(@RequestBody gameDTO : GameDTO): Game {
        val createGame = this.gameService.createGame(gameDTO)

        println(">>>>>>>>> '${createGame.id}'")

        return createGame;
    }
}