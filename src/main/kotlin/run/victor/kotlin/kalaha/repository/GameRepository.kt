package run.victor.kotlin.kalaha.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import run.victor.kotlin.kalaha.model.Game

@Repository
interface GameRepository : MongoRepository<Game, String>  {

    fun findGamesById(id: String)


}
