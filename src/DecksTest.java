import java.util.Scanner;
import java.util.List;

class DecksTest {
    public static void main(String[] args) {
        List<CardColorValue > deck = Deck.generate();
        System.out.println("Ilość kart w talii: "+deck.size()+" sztuki");

        Languages languages = getLanguages();
        printDeck(deck, languages);
    }

    private static Languages getLanguages() {
        printLanguages();
        Languages resultLanguage = null;
        do {
            System.out.println("Wybierz język:");
            Scanner scanner = new Scanner(System.in);
            String lang = scanner.nextLine();
            try {
                resultLanguage = Languages.valueOf(lang);
            } catch (IllegalArgumentException e) {
                System.err.println("Błędny kod języka");
            }
        } while (resultLanguage == null);
        return resultLanguage;
    }

    private static void printLanguages() {
        Languages[] langs = Languages.values();
        System.out.println("Dostępne języki:");
        for (Languages lang : langs) {
            System.out.println(lang);
        }
    }

    private static void printDeck(List<CardColorValue> deck, Languages languages) {
        for (CardColorValue cardColorValue : deck) {
            switch (languages) {
                case EN:
                    System.out.println(cardColorValue.plTranslation());
                    break;
                case PL:
                    System.out.println(cardColorValue.engTranslation());
                    break;
            }
        }
    }
}
