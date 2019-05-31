// yield

val primes = sequence {
    var i: Long = 0
    while(true) {
        i++
        if(isPrime(i)) {
            yield(i)
        }
    }
}