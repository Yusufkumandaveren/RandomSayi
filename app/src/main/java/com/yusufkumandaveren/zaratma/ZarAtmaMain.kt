package com.yusufkumandaveren.zaratma
import kotlin.random.Random

fun zar() {
    val rastgeleSayi = Random
    var sayi = -1

    for (i in 0..5){
        var randomInt:Int

        do {
            randomInt=rastgeleSayi.nextInt(1,6)
        }while (randomInt == sayi)

        sayi = randomInt

        println("Random tamsayı: $randomInt")
    }
}
fun main() {

    var gelenSayilar = zar()

}

