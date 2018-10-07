package BowlingGame

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BowlingTest {

    private val game: Game = Game()

    private fun rollMany(n: Int, pins: Int) {
        for (i in 1..n) {
            game.roll(pins)
        }
    }

    private fun rollSpare() {
        game.roll(5)
        game.roll(5)
    }

    @Test
    fun gutterGame() {
        rollMany(20, 0)
        assertEquals(0, game.score())
    }

    @Test
    fun allOnes() {
        rollMany(20, 1)
        assertEquals(20, game.score())
    }

    @Test
    fun oneSpare() {
        rollSpare()
        game.roll(3)
        rollMany(17, 0)
        assertEquals(16, game.score())
    }

}
