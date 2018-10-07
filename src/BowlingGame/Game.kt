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
            if (isStrike(firstInFrame)) {
                score += 10 + nextTwoBallsForStrike(firstInFrame)
                firstInFrame += 1
            } else if (isSpare(firstInFrame)) {
                score += 10 + nextBallForStrike(firstInFrame)
                firstInFrame += 2
            } else {
                score += twoBallsInFrame(firstInFrame)
                firstInFrame += 2
            }
        }

        return score
    }

    private fun isStrike(firstInFrame: Int): Boolean = rolls[firstInFrame] == 10

    private fun nextTwoBallsForStrike(firstInFrame: Int): Int = rolls[firstInFrame + 1] + rolls[firstInFrame + 2]

    private fun isSpare(firstInFrame: Int): Boolean = twoBallsInFrame(firstInFrame) == 10

    private fun nextBallForStrike(firstInFrame: Int): Int = rolls[firstInFrame + 2]

    private fun twoBallsInFrame(firstInFrame: Int) = rolls[firstInFrame] + rolls[firstInFrame + 1]

}
