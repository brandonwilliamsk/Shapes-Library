package geometry

data class Point(private var x: Double, private var y: Double) {

    init {
        validateInput(x)
        validateInput(y)
    }

    fun clone(): Point = Point(x, y)
    fun getX(): Double = x
    fun getY(): Double = y
    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
        validateInput(x)
        validateInput(y)
    }

    private fun validateInput(value: Any) {
        if (value !is Double || value.isNaN() || value.isInfinite()) {
            throw IllegalArgumentException("Input must be a valid number")
        }
    }

}