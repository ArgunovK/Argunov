package lesson7;

/**
 * Created by Админ on 01.08.2017.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p1 = new Phone(123456, "lenovo", 300);
        Phone p2 = new Phone(987654, "lenovoAB", 320);
        Phone p3 = new Phone(1676767, "Samsung", 500);

        p1.receiveCall("Alex");
        p2.receiveCall("Lana");
        p3.receiveCall("Pavlo");

        p1.getPhoneNumber();
        p2.getPhoneNumber();
        p3.getPhoneNumber();

        System.out.println("number:" + p1.number);
        System.out.println("model:" + p1.model);
        System.out.println("weight:" + p1.weight);

        System.out.println("number:" + p2.number);
        System.out.println("model:" + p2.model);
        System.out.println("weight:" + p2.weight);

        System.out.println("number:" + p3.number);
        System.out.println("model:" + p3.model);
        System.out.println("weight:" + p3.weight);

        p1.receiveCall("Alex");
        p2.receiveCall("Lana");
        p3.receiveCall("Pavlo");

        System.out.println("Number Phone:" + p1.getPhoneNumber());
        System.out.println("Number Phone:" + p2.getPhoneNumber());
        System.out.println("Number Phone:" + p3.getPhoneNumber());

        p1.receiveCall(123456, "Alex" );
    }
}

