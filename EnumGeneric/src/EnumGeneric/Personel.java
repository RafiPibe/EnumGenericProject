package EnumGeneric;

public class Personel<P> {
    P person;

    Personel(P person) {
        this.person = person;
    }

    public P getPerson() {
        return this.person;
    }
}
