
fun main(args: Array<String>) {
 println()
 println("---Poker Combinations---")
 val combination = ConditionsAndCombinations()
 combination.SeniorityCombinations()
 println()
 println("---DECK OF CARDS----")
 println()
 val result = CardsSuits()
 var cards = result.generateCards()
 cards = result.mixCards(cards)
 println("")
 cards = result.mixCards(cards)
 println("")
 cards = result.mixCards(cards)





 }












