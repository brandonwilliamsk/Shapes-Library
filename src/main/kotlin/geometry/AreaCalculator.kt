package geometry

object AreaCalculator {
    fun rectangleArea(width: Double, height: Double): Double = width * height
    fun ellipseArea(radiusX: Double, radiusY: Double): Double = Math.PI * radiusX * radiusY
    fun triangleArea(pointA: Point, pointB: Point, pointC: Point): Double {
        val a = pointA.getX() * (pointB.getY() - pointC.getY())
        val b = pointB.getX() * (pointC.getY() - pointA.getY())
        val c = pointC.getX() * (pointA.getY() - pointB.getY())
        return Math.abs((a + b + c) / 2)
    }
}