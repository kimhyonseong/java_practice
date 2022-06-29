package collection.treeSet;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    private int memberId;
    private String memberName;

    public  Member(){}
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Member member = (Member) o;
//        return memberId == member.memberId;
        if (o instanceof Member) {
            Member member = (Member) o;

            return this.memberId == member.getMemberId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    //Comparable<Member>
    /*
    @Override
    public int compareTo(Member o) {
        //return Integer.compare(this.memberId, o.memberId);

//        if (this.memberId > o.memberId) {
//            return 1;
//        } else if (this.memberId < o.memberId){
//            return -1;
//        } else {
//            return 0;
//        }
        return (this.memberId - o.memberId) * (-1);
    }*/

    @Override
    public int compare(Member o1, Member o2) {
        return (o1.memberId - o2.memberId) * (-1);
    }
}
