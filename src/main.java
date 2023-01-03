public class main {
    public static void main(String [] args){

        ContactsManager myContactsManager = new ContactsManager();

        Contact friendRed = new Contact();

        friendRed.name = "Red";
        friendRed.email = "red@gmail.com";
        friendRed.phoneNumber = "12457890";

        myContactsManager.addContact(friendRed);

        Contact friendBlue = new Contact();

        friendBlue.name = "Blue";
        friendBlue.email = "blue@gmail.com";
        friendBlue.phoneNumber = "987654321";

        myContactsManager.addContact(friendBlue);

        Contact friendGreen = new Contact();

        friendGreen.name = "Green";
        friendGreen.email = "green@gmail.com";
        friendGreen.phoneNumber = "345123987";

        myContactsManager.addContact(friendGreen);

        Contact friendYellow = new Contact();

        friendYellow.name = "Yellow";
        friendYellow.email = "yellow@gmail.com";
        friendYellow.phoneNumber = "9875234567";

        myContactsManager.addContact(friendYellow);

        Contact result = myContactsManager.searchContact("Blue");
        System.out.println("phone number:" + result.email);

    }
}
