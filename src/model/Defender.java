package model;

public class Defender extends FieldPlayer {
    public Defender(String name, int speed, int stamina, int tackling, int interceptions, double staminaReductionRate) {
        super(name, "DF", speed, stamina, 60, 60, tackling, interceptions, staminaReductionRate);
    }

    @Override
    public double calculateOverallScore() {
        double score = ((speed * 0.2) + (stamina * 0.2) + (tackling * 0.3) + (interceptions * 0.3));
        return Math.round(score * 10.0) / 10.0;
    }
}
