package org.andres.common.immutable;

public final class Player {
    private final String name;
    private final int age;
    private final String team;
    private final Ranking ranking;

    public Player(final String name, final int age, final String team, Ranking ranking) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.ranking = new Ranking(ranking.getBattingRank(), ranking.getBowlingRank());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    public Ranking getRanking() {
        return new Ranking(this.ranking.getBattingRank(), this.ranking.getBowlingRank());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                ", ranking: " + ranking.getBattingRank() + ", " + ranking.getBowlingRank() +
                '}';
    }
}
