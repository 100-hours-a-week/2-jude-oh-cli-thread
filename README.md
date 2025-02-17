# 1주차 과제

데이터기반 축구선수 비교분석 프로그램 만들기 (2차 상속 이용)


축구 선수의 **[이름, 포지션, 스피드, 스태미나, 슈팅, 드리블, 태클, 인터셉트, 반사신경, 다이빙]** 총 10개의 데이터를 저장하여 포지션별 선수의 비교 분석을 해준다. 

선수들의 데이터를 가지고 전체적인 선수 스탯을 평가할 수 있는 종합 점수를 계산한다.
공격수, 수비수, 골키퍼 각각이 종합점수 기준이 다르다. 종합점수는 100점 만점으로 계산된다.

## 공격수(FW) 비교 기준

공격수는 슈팅, 드리블, 종합점수 3가지 기준을 가지고 비교가 가능하다.
공격수 종합점수 계산 : (speed * 0.2) + (stamina * 0.2) + (shooting * 0.3) + (dribbling * 0.3)

## 수비수(DF) 비교 기준

수비수는 태클, 인터셉트, 종합점수 3가지 기준을 가지고 비교가 가능하다.
수비수 종합점수 계산 : (speed * 0.2) + (stamina * 0.2) + (tackling * 0.3) + (interceptions * 0.3)

## 골키퍼(GK) 비교 기준

골키퍼는 반사신경, 다이빙, 종합점수 3가지 기준을 가지고 비교가 가능하다.
골키퍼 종합점수 계산 : (reflexes * 0.5) + (diving * 0.5)

### 선수 데이터는 임의로 생성해냈다.
