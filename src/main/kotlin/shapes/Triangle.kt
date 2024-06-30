package shapes

import geometry.AreaCalculator
import geometry.Point

class Triangle(private val pointA: Point, private val pointB: Point, private val pointC: Point) : Shape() {
    init {
        val area = AreaCalculator.triangleArea(pointA, pointB, pointC)
        if (area == 0.0) {
            throw IllegalArgumentException("A triangle cannot have an area of 0")
        }
    }

    override fun move(deltaX: Double, deltaY: Double) {
        pointA.move(deltaX, deltaY)
        pointB.move(deltaX, deltaY)
        pointC.move(deltaX, deltaY)
    }

    override fun getPoints(): List<Point> = listOf(pointA, pointB, pointC)

    override fun calculateArea(): Double = AreaCalculator.triangleArea(pointA, pointB, pointC)
}
