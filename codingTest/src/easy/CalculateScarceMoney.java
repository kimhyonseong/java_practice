package easy;

class ScarceMoneySolution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sumPrice = 0;

        for(int i=0; i<=count; i++) {
            sumPrice += price*i;
            System.out.println(sumPrice);
        }

        if(money - sumPrice < 0) {
            answer = (money - sumPrice) * -1;
            System.out.println(answer);
        }

        return answer;
    }
}

public class CalculateScarceMoney {
    public static void main(String[] args) {
        ScarceMoneySolution solution = new ScarceMoneySolution();
        System.out.println(solution.solution(3,20,4));
    }
}
