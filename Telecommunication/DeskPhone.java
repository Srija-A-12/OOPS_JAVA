package Telecommunication;

public class DeskPhone implements Telephone {

    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Welcome back! Desk phone is powered on.");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now dialing " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Picking up the phone...");
            isRinging = false;
        } else {
            System.out.println("No calls are coming.");
        }
    }

    @Override
    public boolean calling(String phoneNumber) {
        if (phoneNumber.equals(myNumber)) {
            isRinging = true;
            System.out.println("Phone is ringing for number: " + myNumber);
        } else {
            isRinging = false;
            System.out.println("Dialed wrong number, no call ringing.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
