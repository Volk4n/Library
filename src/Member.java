public class Member {

    private final String name;
    private final int memberNo;

    Member(String name, int memberNo) {
        this.name = name;
        this.memberNo = memberNo;
    }

    @Override
    public String toString() {
        return "Member No: " + memberNo + " - Name: " + name;
    }

    public String getName() {
        return name;
    }

    public int getMemberNo() {
        return memberNo;
    }

}
