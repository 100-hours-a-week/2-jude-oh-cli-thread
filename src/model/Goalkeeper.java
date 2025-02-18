package model;

public class Goalkeeper extends Player {
    public Goalkeeper(String name, int reflexes, int diving) {
        super(name, "GK", 40, 40, 0, 0, 40, 40, reflexes, diving);
    }

    @Override
    public double calculateOverallScore() {
        double score = ((reflexes * 0.5) + (diving * 0.5));
        return Math.round(score * 10.0) / 10.0;
    }
}
