package HeadFirst.state;

public class NoQuarter implements State{
  GumballMachine machine;

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
