# 동기화 방법
1. 동기화가 필요한 메서드에 synchronized 추가 - shared resource가 락(블럭상태)이 됨  
2. synchronized 블럭을 사용시 블럭상태가 될 객체를 괄호 안에 넣는다  
   - synchronized(객체) { }
3. Thread쪽에 synchronized를 할 수 있음 - 2번과 같은 방법으로
