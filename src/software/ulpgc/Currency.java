package software.ulpgc;

public class Currency {
    private final String Entity;
    private final String Currency;
    private final String AlphabeticCode;
    private final int NumericCode;

    public Currency(String entity, String currency, String alphabeticCode, int numericCode) {
        Entity = entity;
        Currency = currency;
        AlphabeticCode = alphabeticCode;
        NumericCode = numericCode;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "Entity='" + Entity + '\'' +
                ", Currency='" + Currency + '\'' +
                ", AlphabeticCode='" + AlphabeticCode + '\'' +
                ", NumericCode=" + NumericCode +
                '}';
    }
}
