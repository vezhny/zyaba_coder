package combination
class ConditionsAndCombinations() {
    fun SeniorityCombinations() {

        val errorOutput = "you messed up something"

        when(CardCombinations.FLASH_ROJAL.combinationsValues){
            10 -> println(CardCombinations.FLASH_ROJAL.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.STRIT_FLASH.combinationsValues){
            9-> println(CardCombinations.STRIT_FLASH.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.KARE.combinationsValues){
            8 -> println(CardCombinations.KARE.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.FULL_HAUSE.combinationsValues){
            7 -> println(CardCombinations.FULL_HAUSE.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.FLASH.combinationsValues){
            6 -> println(CardCombinations.FLASH.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.STRIT.combinationsValues){
            5 -> println(CardCombinations.STRIT.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.SET.combinationsValues){
            4 -> println(CardCombinations.SET.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.TWO_PAIRS.combinationsValues){
            3 -> println(CardCombinations.TWO_PAIRS.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.PAIR.combinationsValues){
            2 -> println(CardCombinations.PAIR.combinationsName)
            else -> println("$errorOutput")
        }
        when(CardCombinations.HIGH_CARD.combinationsValues){
            1 -> println(CardCombinations.HIGH_CARD.combinationsName)
            else -> println("$errorOutput")
        }

    }
}




