package run.victor.kotlin.kalaha.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
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

    @GetMapping("/{winner}")
    fun createGame(@PathVariable winner: String): MutableList<Game> {
      return this.gameService.createGame(winner)
    }
}