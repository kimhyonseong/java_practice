# 직렬화 - Serialize
- 인터페이스 상태를 그대로 파일에 저장,전송, 복원하는 방식
- 보조스크림을 활용

### Serialize  
- 직렬화 의도를 표시 해야함 - implements Serializable
- 구현코드가 없는 인터페이스  
- transient : 직렬화하지 않으려는 멤버 변수에 사용(소켓등 직렬화 할 수 없는 객체)
### externalize  
- 직접 객체를 읽고 쓰는 코드를 구현 할 수 있음