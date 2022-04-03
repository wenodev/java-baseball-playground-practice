## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```


## 컨벤션
테스트 코드 네이밍 : MethodName_StateUnderTest_ExpectedBehavior 
참고 : https://dzone.com/articles/7-popular-unit-test-naming

## 야구 게임 요구 사항 정리
- 컴퓨터가 1~9까지 3개의 숫자를 랜덤으로 생성한다.
- 사용자가 3개의 숫자를 선택한다.
- 같은 수가 같은 자리면 스트라이크이다.
- 같은 수가 다른 자리면 볼이다.
- 스트라이크와 볼이 없다면 낫싱이다.
- 힌트를 토대로 컴퓨터의 수를 맞추면 승리한다.

com / user
123 / 121

이렇게 비교해야 하지만 작업단위가 너무 크게 느껴진다.
조금 더 작은 단위로 비교를 해봐야한다.

1 / 1
이렇게 비교하게 되면 위치값을 비교할 수 없다.

(1, 1) (1,4) 
위치값과 숫자값을 만들어 비교하면 STRIKE, BALL, NOTHING을 구할 수 있다.

123 / (1,1)
다음으로는 난이도를 높여 컴퓨터의 숫자는 3개로 사용자의 숫자는 1개와 위치로 하면 좋다.


