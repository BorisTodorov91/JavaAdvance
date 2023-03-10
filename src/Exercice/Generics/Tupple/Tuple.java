package Exercice.Generics.Tupple;


public class Tuple<F, S> {
    private final F first;
    private final S second;

    public Tuple(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", first.toString(), second.toString());
    }
}
