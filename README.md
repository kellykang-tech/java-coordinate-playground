# 좌표 계산기 with 상속, 인터페이스

## 1. 연료 주입
### 기능 요구사항
- 렌터카가 보유하고 있는 차량 (총 5대)
```text
 Sonata 2대
 Avante 1대
 K5 2대
```

- 차량별 연비
```text
 Sonata: 10km/리터
 Avante: 15km/리터
 k5: 13km/리터
```
    
- 고객이 인터넷 예약 시 여행 목적지의 대략적인 이동거리를 입력한다.
  - 사용할 차량과 이동거리를 입력한다.
   
- 고객이 입력한 이동거리를 이용해 차량별로 필요한 연료를 주입한다.
  - 이동거리에 필요한 연료의 양을 계산한다.
    
- 차량 별로 주입해야 할 연료량을 확인할 수 있는 보고서를 만든다.
  - 각 차량별로 필요한 연료량의 결과를 알려준다.   

<br>

## 2.좌표 계산기(선 길이)
### 기능 요구사항
- 사용자에게 x, y 좌표를 입력 받는다.
  ```text
  (10,10)-(14,15)
  ```
- 좌표는 `(x,y)-(x,y)` 형태이다.
  - [ ] `-` 를 기준으로 문자열을 분리한 후 위 절차를 적용한다.
  - [ ] x,y 좌표를 좌표 list 에 저장한다.
  - [ ] 두 점을 잇는 직선으로 가정하고, 두 점 사이의 거리를 계산해서 출력한다.
  - [ ] 정상적인 좌표값을 입력하면, 해당 좌표에 특수문자로 표시해서 출력한다.

- 좌표값을 한 개 입력한 경우 (level 1)
  - [ ] x와 y를 ,(콤마)를 기준으로 분리하고, 문자열이 숫자인 경우에만 정상 좌표로 저장한다. CoordinateCalculator
  - [x] 좌표 클래스는 x와 y의 값을 가진다. Coordinate
  - [x] x,y 좌표의 최대값은 24이다. 입력 범위를 초과하면 에러 문구를 출력하고 다시 입력 받는다.



  
  
  