class CardsSuits() {

    fun listCardsSuits (){

        val cardsSuits = ListCardSuits.values()
        val cardsDeck = CardSymbols.values()
        cardsSuits.forEach { suit ->
            cardsDeck.forEach { deck ->

                println("$suit  $deck")
            }
        }
    }

}



