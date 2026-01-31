package org.andres.common.immutable;

public class PlayerMain {
    static void main() {
        Ranking r1 = new Ranking(1, 100);
        Player p1 = new Player("Andres Merida", 40, "MI",
                r1);

        IO.println(p1.toString());

        r1.setBattingRank(2);
        r1.setBowlingRank(101);
        IO.println(p1.toString());
    }
}
