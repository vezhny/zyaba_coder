import kotlin.random.Random

class CardsProcessor() {
   fun generateCards(): MutableList<Card> {
        val cardsSuits = CardSuits.values()
        val cardsDeck = CardSymbols.values()
        val cards: MutableList<Card> = mutableListOf()
        cardsSuits.forEach { suit ->
            cardsDeck.forEach { deck ->
                cards.add(Card(deck, suit))
            }
        }
        return cards
    }
   fun mixCards (cards: MutableList<Card>): MutableList<Card> {
        val mixedCards : MutableList<Card> = mutableListOf()
        while (cards.isNotEmpty()){
            val targetIndex = Random.nextInt(cards.size)
            mixedCards.add(cards[targetIndex])
            cards.removeAt(targetIndex)
        }
        return mixedCards
    }
     fun shuffling(cards: MutableList<Card>):MutableList<Card> {
        val intRandom = (0..10).random()
        while (cards.isEmpty()) {
            val targetInd = Random.nextInt(intRandom)
           cards[targetInd]
        }
         return cards
    }
    fun printListCards(cardsList:MutableList<Card>) {
        cardsList.forEach { listCards->
            println(listCards)
        }
    }
}







































