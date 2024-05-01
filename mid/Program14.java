
//public class Program14 {
//	public static void main(String[] args) {
//                final int SLOW = 1;             
//                final int MEDIUM = 2;   
//                final int FAST = 3;             
//
//                Fan fan1 = new Fan();
//                Fan fan2 = new Fan();
//                fan1.setSpeed(FAST);
//                fan1.setRadius(10);
//                fan1.setColor("yellow");
//                fan1.turnOn();
//
//                fan2.setSpeed(MEDIUM);
//                fan2.setRadius(5);
//                fan2.setColor("blue");
//                fan2.turnOff();
//
//                System.out.println(fan1.toString());
//                System.out.println(fan2.toString());
//        }
//}
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fan fan1 = new Fan();
        System.out.println("Enter speed for fan1 (1 = SLOW, 2 = MEDIUM, 3 = FAST):");
        int speed1 = scanner.nextInt();
        fan1.setSpeed(speed1);

        System.out.println("Enter radius for fan1:");
        double radius1 = scanner.nextDouble();
        fan1.setRadius(radius1);

        System.out.println("Enter color for fan1:");
        String color1 = scanner.next();
        fan1.setColor(color1);

        System.out.println("Turn on fan1? (true/false):");
        boolean on1 = scanner.nextBoolean();
        if (on1) {
            fan1.turnOn();
        } else {
            fan1.turnOff();
        }

        Fan fan2 = new Fan();
        System.out.println("Enter speed for fan2 (1 = SLOW, 2 = MEDIUM, 3 = FAST):");
        int speed2 = scanner.nextInt();
        fan2.setSpeed(speed2);

        System.out.println("Enter radius for fan2:");
        double radius2 = scanner.nextDouble();
        fan2.setRadius(radius2);

        System.out.println("Enter color for fan2:");
        String color2 = scanner.next();
        fan2.setColor(color2);

        System.out.println("Turn on fan2? (true/false):");
        boolean on2 = scanner.nextBoolean();
        if (on2) {
            fan2.turnOn();
        } else {
            fan2.turnOff();
        }

        scanner.close();

        System.out.println("Fan1 details:\n" + fan1.toString());
        System.out.println("Fan2 details:\n" + fan2.toString());
    }
}
