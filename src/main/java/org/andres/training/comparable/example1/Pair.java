package org.andres.training.comparable.example1;

public record Pair(String x, Integer y) implements Comparable<Pair> {
    @Override
    public int compareTo(Pair o) {
        if (this.x.compareTo(o.x) != 0) {   // if the string are not equal
            return this.x.compareTo(o.x);
        } else {
            return this.y - o.y;            // we compare int values if the strings are equal
        }
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x='" + x + '\'' +
                ", y=" + y +
                '}';
    }
}
