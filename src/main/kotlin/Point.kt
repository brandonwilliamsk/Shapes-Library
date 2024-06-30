package shapes

class Point(private var x: Double, private var y: Double) {
    fun clone(): Point = Point(x, y)
    fun getX(): Double = x
    fun getY(): Double = y
    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}