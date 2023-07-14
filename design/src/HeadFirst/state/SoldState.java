package HeadFirst.state;

public class SoldState implements State{
  GumballMachine machine;

  public SoldState(GumballMachine machine) {
    this.machine = machine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("알맹이를 내보내고 있습니다.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("이미 알겡이를 뽑으셨습니다.");
  }

  @Override
  public void turnCrank() {
    System.out.println("손잡이를 한번만 돌려주세요.");
  }

  @Override
  public void dispense() {
    this.machine.releaseBall();

    if (this.machine.getCount() > 0) this.machine.setState(this.machine.getNoQuarterState());
    else {
      System.out.println("더 이상 알겡이가 없습니다.");
      this.machine.setState(this.machine.getSoldOutState());
    }
  }
}
