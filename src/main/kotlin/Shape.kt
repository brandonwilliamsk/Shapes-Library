package shapes

abstract class Shape {
    abstract fun move(deltaX: Double, deltaY: Double)
    abstract fun getPoints(): List<Point>
    protected abstract fun calculateArea(): Double
    fun getArea(): Double {
        val area = calculateArea()
        if (area == 0.0) throw IllegalStateException("Area cannot be zero")
        return area
    }
}