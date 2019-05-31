operator fun Circle.contains(point: Point)
    (point.x - cx) * (point.x - cx) + (point.y - cy) * (point.y - cy) <
    radius * radius

println(circle.contains(point1)) //true
println(point1 in circle) //true
println(point2 in circle) //false