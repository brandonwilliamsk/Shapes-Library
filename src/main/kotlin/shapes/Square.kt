package shapes
import geometry.Point

class Square(topLeft: Point, sideLength: Double) : Rectangle(topLeft, Point(
    topLeft.getX() + sideLength, topLeft.getY() + sideLength)
) {
    init {
        if (sideLength <= 0) {
            throw IllegalArgumentException("Side length must be greater than 0")
        }
    }
}
