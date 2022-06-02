import kotlin.random.Random

class CardsSuits() {
    fun generateCards(): MutableList<Card> {
        val cardsSuits = ListCardSuits.values()
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
        mixedCards.forEach { card ->
            println(card)
        }
        return mixedCards

    }

}







































