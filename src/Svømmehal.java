public class Svømmehal {

    String by;

    int antalVandrutschebaner;

    double dybdePåVand;

    public Svømmehal(String by, int antalVandrutschebaner, double dybdePåVand) {
        this.by = by;
        this.antalVandrutschebaner = antalVandrutschebaner;
        this.dybdePåVand = dybdePåVand;
    }


    @Override
    public String toString() {
        return "Svømmehal{" +
                "by='" + by + '\'' +
                ", antalVandrutschebaner=" + antalVandrutschebaner +
                ", dybdePåVand=" + dybdePåVand +
                '}';
    }
}
