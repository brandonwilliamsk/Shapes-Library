package geometry

class Line(private val point1: Point, private val point2: Point) {

    init {
        if (point1 == point2) {
            throw IllegalArgumentException("A line cannot have zero length.")
        }
    }

    fun getPoint1(): Point = point1
    fun getPoint2(): Point = point2

    fun getPoints(): List<Point> = listOf(point1, point2)

    fun getSlope(): Double = (point2.getY() - point1.getY()) / (point2.getX() - point1.getX())

    fun getLength(): Double = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2.0) + Math.pow(point2.getY() - point1.getY(), 2.0))

    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
}
