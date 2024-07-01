package shapes
import geometry.Point

class Square(topLeft: Point, sideLength: Double) : Rectangle(topLeft, Point(
    topLeft.getX() + sideLength, topLeft.getY() + sideLength)
) {
    init {
        validateArea()
    }
}
