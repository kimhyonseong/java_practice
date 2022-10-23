package level2;

class MatchSolution
{
  public int solution(int n, int a, int b)
  {
    int answer = 1;
    int tmp = Math.min(a,b);
    b = Math.max(a,b);
    a = tmp;

    //System.out.println(a+"/"+b+"/"+n);

    for(int i=n; i>=1; i/=2) {
      if(a+1 == b && b%2==0) {
        break;
      }
      a = (a%2==1) ? (a+1)/2 : a/2;
      b = (b%2==1) ? (b+1)/2 : b/2;

      answer++;
    }

    return answer;
  }
}

public class MatchDraw {
  public static void main(String[] args) {
    MatchSolution match = new MatchSolution();
    System.out.println(match.solution(8,4,7));
  }
}
