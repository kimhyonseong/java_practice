package HeadFirst.proxy;

public class HasQuarter implements State {
  GumballMachine machine;

  public HasQuarter(GumballMachine machine) {
    this.machine = machine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("동전은 한개만 넣어주세요");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("동전이 반환됩니다.");
    this.machine.setState(this.machine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("손잡이를 돌리셨습니다.");
    this.machine.setState(this.machine.getSoldState());
  }

  @Override
  public void dispense() {
    System.out.println("알겡이를 내보낼 수 없습니다.");
  }
}
