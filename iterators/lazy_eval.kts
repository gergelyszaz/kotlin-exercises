// lazy

val nameOfFirstAdult = people.asSequence()
    .filter(::isAdult)
    .map(::fetchFirstName)
    .first()
println(nameOfFirstAdult)

/*
    isAdult called for Sara
    isAdult called for Jill
    fetchFirstName called for Jill
    Jill
*/