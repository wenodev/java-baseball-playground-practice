package baseball;

import java.util.Random;

public class BaseBall {

    public int generateRandomNumber() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        return (int) ((Math.random() * (1000 - 100)) + 100);
    }

    public String submitAnswer(int number) {
        int randomNumber = 123;
        if (randomNumber == number){
            return "3스트라이크";
        }
        return null;
    }
}
