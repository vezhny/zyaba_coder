import kotlin.random.Random

class ProcessesCards() {
    private fun generateListCards(): MutableList<Card> {
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
    private fun shufflingListCards (cards: MutableList<Card>): MutableList<Card> {
        val mixedCards : MutableList<Card> = mutableListOf()
        while (cards.isNotEmpty()){
            val targetIndex = Random.nextInt(cards.size)
            mixedCards.add(cards[targetIndex])
            cards.removeAt(targetIndex)
        }
        mixedCards.forEach { card ->
        }
        return mixedCards
    }
    fun printListCards() {
        println(shufflingListCards(generateListCards()))
    }
}







































