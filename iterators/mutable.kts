// code smell: mutable 

val doubled = mutableListOf<Int>()
    for(i in numbers) {
        if(i % 2 == 0) {
            doubled.add(i * 2)
        }
    }
println(doubled) //[20, 24, 36]