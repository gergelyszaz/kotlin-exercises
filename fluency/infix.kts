operator infix fun Circle.contains(point: Point) =
    (point.x - cx) * (point.x - cx) + (point.y - cy) * (point.y - cy) <
        radius * radius

println(circle contains point1) //true