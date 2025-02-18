package service;

import model.FieldPlayer;
import model.Player;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class GameSimulation {
    private List<Player> players;
    private boolean isRunning = false;

    public GameSimulation(List<Player> players) {
        this.players = players;
    }

    public void startSimulation() {
        if (isRunning) {
            System.out.println("\n⚠️ 이미 경기가 진행 중입니다!");
            return;
        }

        isRunning = true;  // 경기 시작
        System.out.println("\n⚽ 90초 경기 시작! 필드 플레이어들의 스태미나가 줄어듭니다...");

        Thread simulationThread = new Thread(() -> {
            for (int i = 1; i <= 90; i++) { // 10초 동안 실행
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (players) {
                    for (Player p : players) {
                        if (p instanceof FieldPlayer) { // 필드 플레이어만 스태미너 감소 적용
                            ((FieldPlayer) p).reduceStamina();
                        }
                    }
                }
                if (i % 10 == 0) {
                    System.out.println("\n⏳ 경기 시작 " + i + "초 경과...");
                    displayPlayerScores();
                }
            }
            isRunning = false;
            System.out.println("\n🏁 경기 종료!");
        });
        // simulationThread.start();

        simulationThread.start(); // 새로운 스레드에서 실행
        try {
            simulationThread.join(); // ✅ 시뮬레이션이 끝날 때까지 기다림
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    private void displayPlayerScores() {
        synchronized (players) {
            // 선수들의 총점 계산 후 내림차순 정렬
            Collections.sort(players, Comparator.comparingDouble(Player::calculateOverallScore).reversed());

            System.out.println("\n📊 현재 선수들의 총점 (내림차순):");
            for (Player p : players) {
                if (p instanceof FieldPlayer) { // 필드 플레이어만 출력
                    System.out.println(p.getName() + " - 총점: " + p.calculateOverallScore() + " | 스태미나: " + ((FieldPlayer) p).stamina);
                }
            }
        }
    }
}
