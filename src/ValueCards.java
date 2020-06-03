enum ValueCards {
    TWO("Dwójka", "Two"),
    THREE("Trójka", "Three"),
    FOUR("Czwórka", "Four"),
    FIVE("Piątka", "Five"),
    SIX("Szóstka", "Six"),
    SEVEN("Siódemka", "Seven"),
    EIGHT("Ósemka", "Eight"),
    NINE("Dziewiątka", "Nine"),
    TEN("Dziesiątka", "Ten"),
    JACK("Walet", "Jack"),
    QUEEN("Królowa", "Queen"),
    KING("Król", "King"),
    ACE("As", "Ace");

    private final String engName;
    private final String plName;

    ValueCards(String engName, String plName) {
        this.engName = engName;
        this.plName = plName;
    }

    public String getEngName() {
        return engName;
    }

    public String getPlName() {
        return plName;
    }
}

