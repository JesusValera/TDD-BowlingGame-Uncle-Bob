package BowlingGame

class Game {

    private val rolls = IntArray(21)
    private var currentRoll: Int = 0

    fun roll(pins: Int) {
        rolls[currentRoll++] = pins
    }

    fun score(): Int {
        var score = 0
        var firstInFrame = 0

        for (frame in 0 until 10) {
            if (isSpare(firstInFrame)) {
                score += 10 + rolls[firstInFrame + 2]
            } else {
                score += rolls[firstInFrame] + rolls[firstInFrame + 1]
            }
            firstInFrame += 2
        }

        return score
    }

    private fun isSpare(firstInFrame: Int) = rolls[firstInFrame] + rolls[firstInFrame + 1] == 10

}
