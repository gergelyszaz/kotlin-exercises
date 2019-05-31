data class Point(val x: Int, val y: Int)
data class Circle(val cx: Int, val cy: Int, val radius: Int)

// elsewhere

fun Circle.contains(point: Point) =
(point.x - cx) * (point.x - cx) + (point.y - cy) * (point.y - cy) <
radius * radius