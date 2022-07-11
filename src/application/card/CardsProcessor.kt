package card

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
       val numberOfShuffles = (0..100).random()
       cards.shuffle(Random(numberOfShuffles))
       return cards
    }
    fun printListCards(cardsList:MutableList<Card>) {
        cardsList.forEach { listCards->
            println(listCards)
        }
    }
}







































