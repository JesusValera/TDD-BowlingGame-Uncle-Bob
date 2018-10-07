package BowlingGame

class Game {

    private var score: Int = 0

    fun roll(pins: Int) {
        this.score += pins
    }

    fun score(): Int = score

}
