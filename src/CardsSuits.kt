
import kotlin.random.Random

class CardsSuits() {
    fun listCardsSuits() {
        val cardsSuits = ListCardSuits.values()
        val cardsDeck = CardSymbols.values()
        cardsSuits.forEach { suit ->
            cardsDeck.forEach { deck ->
                println("$suit $deck")

            }
        }
    }
    fun  listlist(){

    val rand = Random.nextInt(ListCardSuits.values().size)
    val randDwa = Random.nextInt(CardSymbols.values().size)
    val nameDwa = "${CardSymbols.values()[randDwa]}"
    val name = "${ListCardSuits.values()[rand]}"
        println("")
    println("$name $nameDwa")

        return

}


}
//







//                var n = "$suit $deck"
//                val arraySize = cardsSuits.size
//                val arraySize_1 = cardsDeck.size
//                val rand = Random.nextInt(arraySize)
//                val rand_1 = Random.nextInt(arraySize_1)
//                val name = "${cardsSuits[rand]}"
//                val name_1 = "${cardsDeck[rand_1]}"
//                println("$name $name_1")





//             val cardRandomDeckSuits = cardsSuits.random()
//                val cardRandomDeckSymbols =  cardsDeck.random()
//                println("$cardRandomDeckSuits $cardRandomDeckSymbols")
//                println("$suit  $deck")
//                println(n)



//
//        }
//        }
//    }
//}













