TreeSet을 사용할땐 추가되는 요소를 비교해야함  
  
Comparable
- compareTo - 넘어온 객체와 나를 비교하여 내가 크면 양수, 내가 작으면 음수 반환

Comparator
- TreeSet(여기에) 속에 Comparator가 구현된 객체를 지정해주어야함
-   TreeSet(Comparator<? super E> comparator) 위는 이거 때문에함