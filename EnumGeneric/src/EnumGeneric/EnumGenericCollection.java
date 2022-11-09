package EnumGeneric;

public class EnumGenericCollection {
    public static void main(String[] args) {
        Personel<String> personel = new Personel<String>("David");
        Country country = Country.INDONESIA;

        System.out.println(personel.getPerson());
        System.out.println(country.getCode());
    }
}
