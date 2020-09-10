import java.util.ArrayList;

public class Contact extends MobilePhone {

    private static String name;
    private static long cellNumber;
    private static long homeNumber;

    public Contact(String name, long cellNumber, long homeNumber) {
        this.name = name;
        this.cellNumber = cellNumber;
        this.homeNumber = homeNumber;
    }

    public static String getName() {
        return name;
    }

    public static long getCellNumber() {
        return cellNumber;
    }

    public static long getHomeNumber() {
        return homeNumber;
    }
}
