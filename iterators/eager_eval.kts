fun isAdult(person: Person): Boolean {
    println("isAdult called for ${person.firstName}")
    return person.age > 17
}
fun fetchFirstName(person: Person): String {
    println("fetchFirstName called for ${person.firstName}")
    return person.firstName
}

// eager evaluation

val nameOfFirstAdult = people
    .filter(::isAdult)
    .map(::fetchFirstName)
    .first()
println(nameOfFirstAdult)

/* 
    isAdult called for Sara
    isAdult called for Jill
    isAdult called for Paula
    isAdult called for Paul
    isAdult called for Mani
    isAdult called for Jack
    isAdult called for Sue
    fetchFirstName called for Jill
    fetchFirstName called for Paula
    fetchFirstName called for Paul
    fetchFirstName called for Jack
    Jill 
*/