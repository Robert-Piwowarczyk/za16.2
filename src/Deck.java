import java.util.List;
import java.util.ArrayList;

class Deck {

    static List<CardColorValue> generate() {
        List<CardColorValue> deck = new ArrayList<>();
        ColorCards[] colorsCards =  ColorCards.values();
        ValueCards[] valuesCards = ValueCards.values();

        for ( ColorCards colorCards : colorsCards) {
            for ( ValueCards valueCards : valuesCards) {
                deck.add(new CardColorValue(valueCards,colorCards));
            }
        }
        return deck;
    }
}