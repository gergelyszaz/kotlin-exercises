// functional style

val doubledEven = numbers.filter { e -> e % 2 == 0 }
    .map { e -> e * 2 };
println(doubledEven) //[20, 24, 36]