package design.observer;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("message forward1");
        button.click("message forward2");
        // 모르겠음
    }
}
