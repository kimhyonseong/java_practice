package varietyClass.innerClass;

class Outer2{
    //이니셜라이즈는 생성자에서 해야함 아래는 그냥 함
    int outNum = 100;
    static int sNum = 200;

    // 익명 내부 클래스 1
    Runnable getRunnable(int i) {
        int num=10;

        //class MyRunnable implements Runnable {
        return new Runnable() {
            int localNum = 1000;
            @Override
            public void run() {
                /*
                getRunnable은 스택에 쌓여서 한번 호출후 사라짐
                run()은 나중에 다시 사용될수 있어고 run()이 호출될때 i,num이 없을 수도 있어서 수정 불가
                MyRunnable 클래스 메서드의 지역변수는 상수화 되어버려서 호출 가능
                i=50;
                num=100;
                 */
                System.out.println("i = "+i);
                System.out.println("num = "+num);
                System.out.println("localNum = "+localNum);

                System.out.println("outNum="+outNum+" (외부클래스의 인스턴스 변수)");
                System.out.println("Outter.sNum="+Outer2.sNum+" (외부클래스의 스태틱 변수)");
            }
        };
        //return new MyRunnable();
    }

    // 익명 내부 클래스 2
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);
        runner.run();

        out.runnable.run();
    }
}
