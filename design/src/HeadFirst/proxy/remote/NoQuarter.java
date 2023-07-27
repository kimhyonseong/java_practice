package HeadFirst.proxy.remote;

public class NoQuarter implements State {
  private static final long serialVersionUID = 2L;
  transient GumballMachine machine;

  public NoQuarter(GumballMachine machine) {
    this.machine = machine;
  }

  @Override
  public void insertQuarter() {
    this.machine.setState(this.machine.getHasQuarterState());
    System.out.println("동전을 넣었습니다.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("동전을 넣어주세요.1");
  }

  @Override
  public void turnCrank() {
    System.out.println("동전을 넣어주세요.2");
  }

  @Override
  public void dispense() {
    System.out.println("동전을 넣어주세요.3");
  }
}
