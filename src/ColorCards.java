public enum ColorCards {
    CLUBS("Żołądź","Clubs"),
    HEARTS("Serce","Hearts"),
    SPADES("Wino","Spades"),
    DIAMONDS("Dzwonek","Diamonds");

    private final String engName;
    private final String plName;

    ColorCards(String engName, String plName) {
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

