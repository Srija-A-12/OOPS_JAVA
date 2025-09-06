package Mobile;

public class Mobile {
    private int screenSize;
    private String companyName;
    private String operatingSystem;
    private int batteryPercent = 100; // default full charge

    //  Constructor
    public Mobile(int screenSize, String companyName, String operatingSystem) {
        this.screenSize = screenSize;
        this.companyName = companyName;
        this.operatingSystem = operatingSystem;
    }

    //  Take Picture
    public void takePicture() {
        if (batteryPercent < 10) {
            System.out.println(" Cannot take picture. Battery too low.");
        } else {
            batteryPercent -= 10;
            System.out.println(" Picture taken successfully.");
        }
    }

    //  Record Video
    public void recordVideo() {
        if (batteryPercent < 30) {
            System.out.println(" Cannot record video. Battery too low.");
        } else {
            batteryPercent -= 30;
            System.out.println(" Video recorded successfully.");
        }
    }

    // Play Game
    public void playGame() {
        if (batteryPercent < 60) {
            System.out.println(" Battery too low to play games.");
        } else {
            batteryPercent -= 60;
            System.out.println("Playing video game...");
        }
    }

    // Charge Mobile
    public void charge() {
        batteryPercent = 100;
        System.out.println(" Mobile fully charged (100%).");
    }

    // Getters and Setters
    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getBatteryPercent() {
        return batteryPercent;
    }

    public void setBatteryPercent(int batteryPercent) {
        this.batteryPercent = batteryPercent;
    }
}
