package run.victor.kotlin.kalaha.exception

class GameNotFoundException(gameId:String, message: String? = "Game not found. ID: '$gameId'") : RuntimeException(message) {

}
