package HeadFirst.state;

public class GumballMachine {
  State soldOutState;
  State soldState;
  State noQuarterState;
  State hasQuarterState;

  State state;
  int count = 0;

  public GumballMachine(int count) {
    this.count = count;

    this.soldOutState = new SoldOutState(this);
    this.soldState = new SoldState(this);
    this.noQuarterState = new NoQuarter(this);
    this.hasQuarterState = new HasQuarter(this);

    if (count > 0) {
      this.state = noQuarterState;
    } else {
      this.state = soldOutState;
    }
  }

  public void insertQuarter() {
    this.state.insertQuarter();
  }

  public void ejectQuarter() {
    this.state.ejectQuarter();
  }

  // 손잡이 돌리기
  public void turnCrank() {
    this.state.turnCrank();
    this.state.dispense();
  }

  @Override
  public String toString() {
    return "GumballMachine{" +
            "state=" + state +
            ", count=" + count +
            '}';
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return this.state;
  }

  public void releaseBall() {
    System.out.println("알맹이를 내보내고 있습니다.");
    if (count > 0) {
      count -= 1;
    }
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }
}
