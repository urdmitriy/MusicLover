import kotlin.math.roundToInt

fun main(){
    var paySum: Float = 15_000f
    var regularСustomer: Boolean = false
    val regularСustomerSalePercent: Float = 1f
    val middleСustomerSalePercent: Float = 5f
    val minСustomerSaleRub: Float = 100f


    paySum = if (paySum >= 1_001 && paySum < 10_001) {
        paySum - minСustomerSaleRub
    } else if (paySum >= 10_001f) {
        paySum * (100 - middleСustomerSalePercent) / 100
    } else {
        paySum
    }
    if (regularСustomer) paySum *= (100 - regularСustomerSalePercent) / 100

    println("Стоимость покупки: ${paySum.roundToInt()} руб.")
}