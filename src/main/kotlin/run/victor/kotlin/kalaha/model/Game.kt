package run.victor.kotlin.kalaha.model


import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document

@Document
@TypeAlias("Game")
 open class Game(val id: String, val board: String, val winner: String, val turnOfWithId: String) {
}