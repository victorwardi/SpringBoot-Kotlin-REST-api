package run.victor.kotlin.kalaha

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import run.victor.kotlin.kalaha.dto.GameDTO
import run.victor.kotlin.kalaha.model.Game


/**
 *
 *
 * @author Victor Wardi - @victorwardi
 *
 */
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationTests (@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `create new game`() {
        val gameDTO = GameDTO("Bart", "Liza")

        val gameCreated = restTemplate.postForObject("/game", gameDTO, Game::class.java)
        assertThat(gameCreated.firstPlayer.name).isEqualTo("Bart")
        assertThat(gameCreated.secondPlayer.name).isEqualTo("Liza")
        assertThat(gameCreated.id.isNullOrBlank())

        println(gameCreated.toString())
    }
}