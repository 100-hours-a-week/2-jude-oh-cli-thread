package main;

import model.*;
import service.GameSimulation;
import service.PlayerComparison;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballGame {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        GameSimulation simulation = new GameSimulation(players);
        PlayerComparison comparison = new PlayerComparison(players);

        // 토트넘 선수 추가
        players.add(new Forward("손흥민", 90, 105, 95, 88, 0.4));  // 체력 좋음 (0.8~1.5 감소)
        players.add(new Forward("해리 케인", 88, 108, 94, 85, 0.3)); // 체력 최강 (0.8~1.5 감소)
        players.add(new Forward("쿨루셉스키", 85, 98, 90, 83, 0.9)); // 보통 (1.5~2.5 감소)
        players.add(new Defender("로메로", 75, 110, 92, 88, 0.8));  // 체력 최강 (0.8~1.5 감소)
        players.add(new Defender("다이어", 73, 97, 87, 84, 0.9));  // 보통 (1.5~2.5 감소)
        players.add(new Goalkeeper("요리스", 95, 94)); // 골키퍼는 스태미나 감소 없음

        // 맨유 선수 추가
        players.add(new Forward("래시포드", 89, 100, 93, 87, 0.7));  // 보통 (1.5~2.5 감소)
        players.add(new Forward("브루노", 87, 107, 91, 85, 0.9));  // 체력 강함 (0.8~1.5 감소)
        players.add(new Forward("안토니", 84, 95, 89, 84, 0.6));  // 체력 약함 (2.5~3.8 감소)
        players.add(new Defender("바란", 74, 110, 90, 86, 0.9));  // 체력 최강 (0.8~1.5 감소)
        players.add(new Defender("마르티네스", 72, 92, 85, 83, 0.9));  // 체력 약함 (2.5~3.8 감소)
        players.add(new Goalkeeper("데 헤아", 96, 95));  // 골키퍼는 스태미나 감소 없음



        while (true) {
            // if (simulation.isRunning()) { // 경기가 진행중일때는 멈추기
            //     continue;
            // }
            System.out.println("\n🎮 메뉴를 선택하세요:");
            System.out.println("1. 선수 능력치 비교");
            System.out.println("2. 경기 시뮬레이션");
            System.out.println("3. 종료");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 3) {
                System.out.println("\n👋 프로그램을 종료합니다.");
                break;
            } else if (choice == 1) {
                comparison.comparePlayersByPosition(scanner);
            } else if (choice == 2) {
                simulation.startSimulation();
            } else {
                System.out.println("❌ 잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
        scanner.close();
    }
}