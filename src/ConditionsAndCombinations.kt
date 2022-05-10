
class ConditionsAndCombinations() {
    fun SeniorityCombinations() {

        val no = "you messed up something"

        when(CardCombinations.FLASH_ROJAL.combinationsValues){
            10 -> println(CardCombinations.FLASH_ROJAL.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.STRIT_FLASH.combinationsValues){
            9-> println(CardCombinations.STRIT_FLASH.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.KARE.combinationsValues){
            8 -> println(CardCombinations.KARE.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.FULL_HAUSE.combinationsValues){
            7 -> println(CardCombinations.FULL_HAUSE.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.FLASH.combinationsValues){
            6 -> println(CardCombinations.FLASH.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.STRIT.combinationsValues){
            5 -> println(CardCombinations.STRIT.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.SET.combinationsValues){
            4 -> println(CardCombinations.SET.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.TWO_PAIRS.combinationsValues){
            3 -> println(CardCombinations.TWO_PAIRS.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.PAIR.combinationsValues){
            2 -> println(CardCombinations.PAIR.combinationsName)
            else -> println("$no")
        }
        when(CardCombinations.HIGH_CARD.combinationsValues){
            1 -> println(CardCombinations.HIGH_CARD.combinationsName)
            else -> println("$no")
        }

    }
}




