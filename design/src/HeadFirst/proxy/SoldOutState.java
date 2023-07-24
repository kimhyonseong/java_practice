package HeadFirst.proxy;

public class SoldOutState implements State {
  GumballMachine machine;

  public SoldOutState(GumballMachine machine) {
    this.machine = machine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("매진되었습니다.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("동전을 넣지 않으면 반환되지 않습니다.");
  }

  @Override
  public void turnCrank() {
    System.out.println("매진 되었습니다.");
  }

  @Override
  public void dispense() {
    System.out.println("매진입니다.");
  }
}
