package Mobile;

public class Main {
    public static void main(String[] args) {
        //  Create a Mobile object
        Mobile mobile = new Mobile(15, "Apple", "iOS");

        //  Perform operations
        mobile.takePicture();
        mobile.recordVideo();
        mobile.playGame();

        System.out.println(" Battery left: " + mobile.getBatteryPercent() + "%");

        //  Charging and reusing
        mobile.takePicture();
        mobile.charge();
        mobile.takePicture();
    }
}
