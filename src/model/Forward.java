package model;

public class Forward extends FieldPlayer {
    public Forward(String name, int speed, double stamina, int shooting, int dribbling, double staminaReductionRate) {
        super(name, "FW", speed, stamina, shooting, dribbling, 50, 50, staminaReductionRate);
        
    }

    @Override
    public double calculateOverallScore() {
        double score = ((speed * 0.2) + (stamina * 0.2) + (shooting * 0.3) + (dribbling * 0.3));
        return Math.round(score * 10.0) / 10.0;
    }
}
