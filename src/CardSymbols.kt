enum class CardSymbols(val designations:Any) {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK("JACK"),
    QUEEN("QUEEN"),
    KING("KING"),
    ACE("ACE");
    fun CardDeck(){
        val DeckCardsList = listOf<Any>(designations)
        println(DeckCardsList)
    }
}