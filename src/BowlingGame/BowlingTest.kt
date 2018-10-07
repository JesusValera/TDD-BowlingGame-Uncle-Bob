package BowlingGame

import org.junit.jupiter.api.Test

class BowlingTest {

    private val game: Game = Game()

    @Test
    fun canRoll() {
        game.roll(0)
    }
}
