
fun main(args: Array<String>) {
 println()
 println("---Poker Combinations---")
 val combination = ConditionsAndCombinations()
 combination.SeniorityCombinations()
 println()
 println("---DECK OF CARDS----")
 println()
 val cardsProcessor = CardsProcessor()
 var cards = cardsProcessor.generateCards()
 cards = cardsProcessor.mixCards(cards)
 cardsProcessor.printListCards(cards)
}












