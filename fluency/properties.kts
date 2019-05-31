val Circle.area: Double
    get() = kotlin.math.PI * radius * radius

// elsewhere

val circle = Circle(100, 100, 25)
println("Area is ${circle.area}") //1963.49...