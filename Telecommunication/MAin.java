package Telecommunication;

public class MAin {
    public static void main(String[] args) {
        DeskPhone myDeskPhone = new DeskPhone("1234567890");
        myDeskPhone.powerOn();

        // Call correct number
        myDeskPhone.calling("1234567890");
        myDeskPhone.answer();

        // Call wrong number
        myDeskPhone.calling("1111111111");
        myDeskPhone.answer();
    }
}
