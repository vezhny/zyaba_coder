package card

class Card(var value: CardSymbols, var suit: CardSuits) {
    override fun toString(): String {
        return "Card ($value - $suit)"
    }
}



