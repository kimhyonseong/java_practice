package collection.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * (-1);
    }
}

public class MemberTreeSetTest {
    public static void main(String[] args) {
        /*
        TreeSet<String> set = new TreeSet<>();

        set.add("홍길동");
        set.add("강감찬");
        set.add("이순신");

        System.out.println(set);
         */

        /*
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1004,"이순신");
        Member member2 = new Member(1001,"감유신");
        Member member3 = new Member(1002,"강감찬");
        Member member4 = new Member(1003,"홍길동");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.addMember(member4);

        memberTreeSet.showAllMember();
//        memberHashSet.removeMember(member2.getMemberId());
//        memberHashSet.showAllMember();
         */
        TreeSet<String> set = new TreeSet<>(new MyComparator());
        set.add("kim");
        set.add("lee");
        set.add("park");

        System.out.println(set);
    }
}
