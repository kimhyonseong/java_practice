package greed;

import java.util.Arrays;

class Coin {
    int[] coinList = {500, 100, 50, 1};
    int length = coinList.length;
    int[] coinDetail = new int[length];
    int value = 0;

    Coin() {}
    Coin(int value) {
        this.value = value;

        greedAlgorithm();
    }

    public void greedAlgorithm() {
        for(int i=0; i<length; i++) {
            coinDetail[i] = value / coinList[i];
            value -= coinDetail[i] * coinList[i];
        }
    }

    public void printResult() {
        for(int i=0; i<length; i++) {
            System.out.println(coinList[i]+"원 동전 : "+coinDetail[i]+"개");
        }
    }
}

public class coinTest {
    public static void main(String[] args) {
        Coin coin = new Coin(4720);
        coin.printResult();
    }
}
