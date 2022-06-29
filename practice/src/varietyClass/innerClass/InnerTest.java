package varietyClass.innerClass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    // 생성될때 인클래스 생성
    public OutClass() {
        inClass = new InClass();
    }
    private class InClass{
        int iNum = 100;

        void inTest() {
            System.out.println("num="+num+" (외부클래스의 인스턴스 변수)");
            System.out.println("sNum="+sNum+" (외부클래스의 스태틱 변수)");
            System.out.println("iNum="+iNum+" (내부클래스의 인스턴스 변수)");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            // 외부의 인스턴스 변수는 생성이 안됬을 수도 있으니 사용 불가
            // 생성 후 호출 가능하니 내부 인스턴스는 사용 가능
            System.out.println("InClass num="+iNum+" (내부클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum="+sNum+" (외부클래스의 스태틱 변수)");
            System.out.println("InClass iNum="+sInNum+" (내부클래스의 스태틱 변수)");
        }

        static void sTest() {
            // 생성과 상관 없이 사용해야 하여 인스턴스 변수 사용 불가
            //System.out.println("InClass num="+iNum+" (내부클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum="+sNum+" (외부클래스의 스태틱 변수)");
            System.out.println("InClass iNum="+sInNum+" (내부클래스의 스태틱 변수)");
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        /*
        OutClass outClass = new OutClass();
        outClass.usingClass();
        System.out.println();
         */

        //private가 아닐땐 문법적으로는 가능
        /*
        OutClass.InClass inClass = outClass.new InClass();
        inClass.inTest();
         */
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        System.out.println();

        OutClass.InStaticClass.sTest();
    }
}
