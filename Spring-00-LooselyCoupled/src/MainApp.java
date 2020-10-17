import Interface.Mentor;
import Service.FullTimeMentor;
import Service.MentorAccount;
import Service.PartTimeMentor;

public class MainApp {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        MentorAccount mentor = new MentorAccount(fullTimeMentor);
        mentor.manageAccount();

        PartTimeMentor partTimeMentor = new PartTimeMentor();
        MentorAccount mentorAccount = new MentorAccount(partTimeMentor);
        mentorAccount.manageAccount();
    }
}