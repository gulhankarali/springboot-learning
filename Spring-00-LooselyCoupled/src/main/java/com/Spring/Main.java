package com.Spring;

import com.Spring.service.FullTimeMentor;
import com.Spring.service.MentorAccount;
import com.Spring.service.PartTimeMentor;

public class Main {
    public static void main(String[] args) {

        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTimeMentor);
        MentorAccount mentor2 = new MentorAccount(partTimeMentor);

        mentor.manageAccount();
        mentor2.manageAccount();

    }

}
