package collection.list;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001,"김");
        Member member2 = new Member(1002,"이");
        Member member3 = new Member(1003,"박");
        Member member4 = new Member(1004,"강");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(member2.getMemberId());
        memberArrayList.showAllMember();
    }
}
