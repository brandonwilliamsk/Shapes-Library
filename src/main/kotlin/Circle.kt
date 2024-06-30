package shapes

class Circle(center: Point, radius: Double) : Ellipse(center, radius, radius) {
    init {
        if (radius <= 0) {
            throw IllegalArgumentException("Radius must be greater than 0")
        }
    }
}
