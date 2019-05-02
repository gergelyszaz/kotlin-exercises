println("hello")

open class Fruit constructor(_weight: Int, _ripened: Boolean){

    val weight: Int
    val ripened: Boolean

    init {
        weight = _weight
        ripened = _ripened
    }

    fun getWeight(): Int {return weight} 
    fun isRipened(): Boolean {return ripened}
}

class Banana constructor(_weight: Int, _isRipened: Boolean, _isCookingBanana: Boolean): Fruit(_weight, _isRipened) {
    fun isCookingBanana() {}
}

class Cherry constructor(_weight: Int, _isRipened: Boolean, _isSourCherry: Boolean) : Fruit(_weight, _isRipened) {
    fun isSourCherry() {}
}

fun sort(fruits: List<Fruit>) {

}

