package collection.hashMap;


import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberTreeSet = new MemberHashMap();

        Member member1 = new Member(1004,"이순신");
        Member member2 = new Member(1001,"감유신");
        Member member3 = new Member(1002,"강감찬");
        Member member4 = new Member(1003,"홍길동");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.addMember(member4);

        memberTreeSet.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001,"k");
        hashMap.put(1002,"h");
        hashMap.put(1004,"s");
        hashMap.put(1003,"a");

        System.out.println(hashMap);

    }
}
