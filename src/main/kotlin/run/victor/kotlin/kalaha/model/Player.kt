package run.victor.kotlin.kalaha.model

import java.util.*

data class Player(val name:String) {
    val id = UUID.randomUUID()
    var pits = IntArray(6) { 6 }
    var kalaha = 0
}
