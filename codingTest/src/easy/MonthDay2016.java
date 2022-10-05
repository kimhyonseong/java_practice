package easy;

class MonthDay2016Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] dayStr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] days = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        int selectDay = 0;

        for(int i=0; i<a-1; i++) {
            selectDay += days[i];
        }
        System.out.println(selectDay+b);

        answer = dayStr[(selectDay+b+4)%7];

        return answer;
    }
}

public class MonthDay2016 {
    public static void main(String[] args) {
        MonthDay2016Solution solution = new MonthDay2016Solution();
        System.out.println(solution.solution(5,24));
    }
}
