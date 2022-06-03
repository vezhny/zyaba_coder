class Card(var value: CardSymbols, var suit: ListCardSuits) {
    override fun toString(): String {
        return "Card ($value - $suit)"
    }
}



