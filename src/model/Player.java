package model;

public abstract class Player {
    public String name, position;
    public int speed, shooting, dribbling, tackling, interceptions, reflexes, diving;
    public double stamina;
    
    public Player(String name, String position, int speed, double stamina, int shooting, int dribbling, int tackling, int interceptions, int reflexes, int diving) {
        this.name = name;
        this.position = position;
        this.speed = speed;
        this.stamina = stamina;
        this.shooting = shooting;
        this.dribbling = dribbling;
        this.tackling = tackling;
        this.interceptions = interceptions;
        this.reflexes = reflexes;
        this.diving = diving;
    }

    // **추상 메서드 선언**
    public abstract double calculateOverallScore();

    public String getName() {
        return name;
    }

    public double getStamina() {
        return stamina;
    }

    public String getPosition() {
        return position;
    }
}

//    public void displayStats() {
//        System.out.println("\n🏆 선수: " + name + " | 포지션: " + position);
//        System.out.println("⚡ 속도: " + speed + " | 💪 체력: " + stamina);
//        System.out.println("🎯 슛: " + shooting + " | ⚽ 드리블: " + dribbling);
//        System.out.println("🛡️ 태클: " + tackling + " | 🚧 인터셉트: " + interceptions);
//        System.out.println("🧤 Reflexes: " + reflexes + " | 🏆 Diving: " + diving);
//        System.out.println("📊 종합 점수: " + calculateOverallScore(position));
//    }

