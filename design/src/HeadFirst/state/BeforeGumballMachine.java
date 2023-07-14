package HeadFirst.state;

public class BeforeGumballMachine {
  final static int HAS_QUARTER = 0;
  final static int NO_QUARTER = 1;
  final static int SOLD_OUT = 2;
  final static int SOLD = 3;

  int state;
  int count;

  public BeforeGumballMachine(int count) {
    this.count = count;
    state = NO_QUARTER;
  }

  public void insertQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("동전은 한개만 넣어주세요");
    } else if(state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println("동전을 넣었습니다.");
    } else if(state == SOLD_OUT) {
      System.out.println("매진되었습니다.");
    } else if(state == SOLD) {
      System.out.println("알맹이를 내보내고 있습니다.");
    }
  }

  public void ejectQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("동전이 반환됩니다.");
      state = NO_QUARTER;
    } else if(state == NO_QUARTER) {
      System.out.println("동전을 넣어주세요.");
    } else if(state == SOLD_OUT) {
      System.out.println("동전을 넣지 않으면 반환되지 않습니다.");
    } else if(state == SOLD) {
      System.out.println("이미 알겡이를 뽑으셨습니다.");
    }
  }

  // 손잡이 돌리기
  public void turnCrank() {
    if (state == HAS_QUARTER) {
      System.out.println("손잡이를 돌리셨습니다.");
      state = SOLD;
      dispense();
    } else if(state == NO_QUARTER) {
      System.out.println("동전을 넣어주세요.");
    } else if(state == SOLD_OUT) {
      System.out.println("매진 되었습니다.");
    } else if(state == SOLD) {
      System.out.println("손잡이를 한번만 돌려주세요.");
    }
  }

  public void dispense() {
    if (state == HAS_QUARTER) {
      System.out.println("알겡이를 내보낼 수 없습니다.");
      state = NO_QUARTER;
    } else if(state == NO_QUARTER) {
      System.out.println("동전을 넣어주세요.");
    } else if(state == SOLD_OUT) {
      System.out.println("매진입니다.");
    } else if(state == SOLD) {
      System.out.println("알겡이를 내보내고 있습니다.");
      --count;

      if (count > 0) state = NO_QUARTER;
      else {
        state = SOLD_OUT;
        System.out.println("더 이상 알겡이가 없습니다.");
      }
    }
  }

  @Override
  public String toString() {
    return "GumballMachine{" +
            "state=" + state +
            ", count=" + count +
            '}';
  }
}
