import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {

    int carSpeed = 50;
    // evro = " €";
    static boolean istown = true;

    public static void main(String[] args) {
        TreeMap<Integer, Integer> realSpeedToExpectedFine;
        SpeedRules speedRules;

        if (istown) {
            System.out.println("Система расчёта штрафов в населеном пункте");
            speedRules = new TownSpeedRules();

            realSpeedToExpectedFine = new TreeMap<Integer, Integer>();
            realSpeedToExpectedFine.put(49, 0);
            realSpeedToExpectedFine.put(50, 30);
            realSpeedToExpectedFine.put(65, 50);
            realSpeedToExpectedFine.put(70, 70);
            realSpeedToExpectedFine.put(75, 115);
            realSpeedToExpectedFine.put(80, 180);
            realSpeedToExpectedFine.put(90, 260);
            realSpeedToExpectedFine.put(100, 400);
            realSpeedToExpectedFine.put(110, 650);
            realSpeedToExpectedFine.put(120, 650);
            realSpeedToExpectedFine.put(121, 800);
        } else {
            System.out.println("Система расчёта штрафов вне населенного пункта");
            speedRules = new NTownSpeedRules();

            realSpeedToExpectedFine = new TreeMap<Integer, Integer>();
            realSpeedToExpectedFine.put(49, 0);
            realSpeedToExpectedFine.put(50, 20);
            realSpeedToExpectedFine.put(65, 30);
            realSpeedToExpectedFine.put(70,60);
            realSpeedToExpectedFine.put(75, 100);
            realSpeedToExpectedFine.put(80, 150);
            realSpeedToExpectedFine.put(90, 200);
            realSpeedToExpectedFine.put(100, 320);
            realSpeedToExpectedFine.put(110, 480);
            realSpeedToExpectedFine.put(120, 600);
            realSpeedToExpectedFine.put(121, 700);
        }

        check(realSpeedToExpectedFine, speedRules);
    }

    private static void check(TreeMap<Integer, Integer> realSpeedToExpectedFine, SpeedRules speedRules) {

        for (Entry<Integer, Integer> entry : realSpeedToExpectedFine.entrySet()) {
            int realSpeed = entry.getKey();
            int expectedFine = entry.getValue();
            
            int overSpeed = realSpeed - speedRules.maxSpeed;
            if (overSpeed < 1) {
                System.out.println("Превышения для скорости " + realSpeed + " нет");
                continue;
            }

            int calculateFine = calculateFine(overSpeed, speedRules);

            if (calculateFine != expectedFine) {
                System.out.println("Неверный штраф " + expectedFine + " для скорости " + realSpeed);
            } else {
                System.out.println("Штраф " + expectedFine + " для скорости " + realSpeed + " рассчитан верно");
            }
        }
    }

    public static int calculateFine(int overSpeed, SpeedRules speedRules) {
        for (Entry<Integer, Integer> entry : speedRules.overSpeedToFine.entrySet()) {
            int fineOverSpeed = entry.getKey();
            if (overSpeed <= fineOverSpeed) {
                return entry.getValue();
            }
        }
        return -1;
    }
}