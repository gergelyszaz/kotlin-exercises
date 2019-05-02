println("hello")

open class Fruit constructor(val _weight: Int, val _ripened: Boolean){
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
           x.isRipened() -> -1
           y.isRipened() -> 1
           else -> -1
        }
    })
}


val fruits = listOf(Banana(6,false,true),Cherry(4,true,true))
println(sort(fruits))

