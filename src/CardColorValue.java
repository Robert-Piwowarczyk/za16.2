class CardColorValue {
    private ValueCards value;
    private ColorCards color;


    public CardColorValue(ValueCards value, ColorCards color) {
        this.value = value;
        this.color = color;
    }

    public String engTranslation() {
        return value.getEngName() + " " + color.getEngName();
    }

    public String plTranslation() {
        return value.getPlName() + " " + color.getPlName();
    }
}
