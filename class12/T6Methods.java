package class12;

public class T6Methods {
    //Create a method createEmail(). Based on values of users first
    //Name, lastName and email type, your method should return
    // complete email Address.
    //Example: createEmail(John, Snow, gmail) -> johnsnow@gmail.com


    public String createEmail(String fName, String lName, String emailType) {
        return fName + lName + "@" + emailType + ".com";
    }
    }











