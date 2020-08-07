public enum RomanNum {

    I("I",1), II("II", 2), III("III", 3), IV("IV", 4), IX("IX", 9),
    V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8), X("X", 10);

    private String key;
    private int value;

    RomanNum(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public String getKey(int a) {
        return key;
    }
}

//    I("I", 1), IV("IV", 4);...и т.д.
//
//private int value;
//private String key;
//RomanNumeral(String key, int value) {
//    this.value = value;

