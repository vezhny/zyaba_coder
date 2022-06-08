
fun main(args: Array<String>) {
 println()
 println("---Poker Combinations---")
 val combination = ConditionsAndCombinations()
 combination.SeniorityCombinations()
 println()
 println("---DECK OF CARDS----")
 println()
 val result = CardsProcessor()
 var cards = result.generateCards()
 cards = result.mixCards(cards)
 result.printListCards(cards)
}












