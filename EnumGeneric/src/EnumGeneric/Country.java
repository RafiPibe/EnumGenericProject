package EnumGeneric;

public enum Country {
    INDONESIA("IDR", "Rupiah"),
    INDIA("INR", "Rupee");

    private String code;
    private String currency;

    private Country(String code, String currency) {
        this.code = code;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public String getCurrency() {
        return currency;
    }
}
