package Telecommunication;

public interface Telephone {
    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean calling(String phoneNumber);
    boolean isRinging();
}
