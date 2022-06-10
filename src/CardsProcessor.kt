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
        val listCards : MutableList<Card> = mutableListOf()
        while (cards.isNotEmpty()){
            val targetIndex = Random.nextInt(cards.size)
            listCards.add(cards[targetIndex])
            cards.removeAt(targetIndex)
        }
        return listCards
    }
    fun printListCards(mixedCards:MutableList<Card>) {
        mixedCards.forEach { cardsList->
            println(cardsList)
        }
    }
}







































