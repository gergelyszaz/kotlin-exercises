println("hello")

open class Fruit constructor(val _weight: Int, val _ripened: Boolean){
    fun getWeight(): Int { return _weight}
    fun isRipened(): Boolean {return _ripened}
}

class Banana constructor(_weight: Int, _isRipened: Boolean, val _isCookingBanana: Boolean): Fruit(_weight, _isRipened) {
    fun isCookingBanana() : Boolean { return _isCookingBanana}
}

class Cherry constructor(_weight: Int, _isRipened: Boolean, val _isSourCherry: Boolean) : Fruit(_weight, _isRipened) {
    fun isSourCherry() : Boolean { return _isSourCherry}
}


fun sort(fruits: List<Fruit>) : List<Fruit> {
    return fruits.sortedWith( Comparator<Fruit>{ x, y ->  
        when {
            ( !x.isRipened() || !y.isRipened() )  -> 0;
            x is Banana && y is Cherry -> -1
            x is Cherry && y is Banana -> 1
            x is Cherry && y is Cherry -> -x.isSourCherry().compareTo(y.isSourCherry())
            x is Banana && y is Banana -> -x.isCookingBanana().compareTo(y.isCookingBanana())
            else -> x.getWeight().compareTo(y.getWeight())
        }
    })
}


val fruits = listOf(
    Cherry(10,true,false),
    Banana(6,true,true),
    Cherry(4,true,true),
    Banana(5,true,true),
    Banana(2,true,false)

)
println(fruits)
println(sort(fruits))

