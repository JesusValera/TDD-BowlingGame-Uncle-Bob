package BowlingGame

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BowlingTest {

    private val game: Game = Game()

    @Test
    fun canRoll() {
        game.roll(0)
    }

    @Test
    fun gutterGame() {
        for (i in 1..20) {
            game.roll(0)
        }
        assertEquals(0, game.score())
    }
}
