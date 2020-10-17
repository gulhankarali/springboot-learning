package Services;

import Interfaces.Mentor;

public class MentorAccount {

    Mentor mentor;
    public MentorAccount(Mentor mentor){
        this.mentor = mentor;
    }
    public void manageAccount(){
        this.mentor.createAccount();
    }

}