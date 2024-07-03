package shapes
import geometry.Point

abstract class ShapeAbstract {
    abstract fun move(deltaX: Double, deltaY: Double)
    abstract fun getPoints(): List<Point>
    protected abstract fun calculateArea(): Double

    fun validateArea() {
        val area = calculateArea()
        if (area <= 0.0) {
            throw IllegalArgumentException("Area cannot be zero")
        }
    }

    fun validateRadius(radius: Double) {
        if (radius < 0) {
            throw IllegalArgumentException("Radius cannot be negative")
        }
    }

    fun validateInputIsNumber(value: Any) {
        if (value !is Double || value.isNaN() || value.isInfinite()) {
            throw IllegalArgumentException("Input must be a valid number")
        }
    }

    fun getArea(): Double {
        validateArea()
        return calculateArea()
    }
}