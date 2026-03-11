class Member{
    int memberId;
    String memberShiptype;

    Member(){
        this.memberId = 501;
        this.memberShiptype = "Regular";
    }

    void ship(){
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Ship ID: "+memberShiptype);
    }

}

public class ProfileLibrary {
    
    public static void main(String[] args){

        Member member = new Member();
        member.ship();

    }

}
