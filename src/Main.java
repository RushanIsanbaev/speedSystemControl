import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
    // evro = " €";
    // Задаём где мы находимся. true - город. false - загород
    static boolean istown = false;

    public static void main(String[] args) {
        // объявляем данные для теста, слева реальная скорость(ключ), справа ожидаемый
        // штраф за превышение (значение)
        TreeMap<Integer, Integer> realSpeedToExpectedFine;
        // объявляем правила по скорости
        SpeedRules speedRules;

        if (istown) {
            System.out.println("Система расчёта штрафов в населеном пункте");
            // Для города создаем объект с правилами города TownSpeedRules
            speedRules = new TownSpeedRules();

            // создаём коллекцию для тестовых данных. TreeMap хранит пары ключ-значение по возрастанию ключа
            realSpeedToExpectedFine = new TreeMap<Integer, Integer>();

            // Для скорости 49 ожидаем штраф 0
            realSpeedToExpectedFine.put(49, 0);
            // Для скорости 50 ожидаем штраф 30
            realSpeedToExpectedFine.put(50, 30);
            // Для скорости 65 ожидаем штраф 50
            realSpeedToExpectedFine.put(65, 50);
            realSpeedToExpectedFine.put(70, 70);
            realSpeedToExpectedFine.put(75, 115);
            realSpeedToExpectedFine.put(80, 180);
            realSpeedToExpectedFine.put(90, 260);
            realSpeedToExpectedFine.put(100, 400);
            realSpeedToExpectedFine.put(110, 560);
            realSpeedToExpectedFine.put(120, 700);
            realSpeedToExpectedFine.put(121, 800);
        } else {
            System.out.println("Система расчёта штрафов вне населенного пункта");
            // Для загорода создаем объект с правилами загорода TownSpeedRules
            speedRules = new NTownSpeedRules();

            realSpeedToExpectedFine = new TreeMap<Integer, Integer>();
            // Для скорости 49 ожидаем штраф 0
            realSpeedToExpectedFine.put(59, 0);
            realSpeedToExpectedFine.put(60, 20);
            realSpeedToExpectedFine.put(75, 30);
            realSpeedToExpectedFine.put(76, 30);
            realSpeedToExpectedFine.put(80, 60);
            realSpeedToExpectedFine.put(80, 60);
            realSpeedToExpectedFine.put(90, 100);
            realSpeedToExpectedFine.put(100, 150);
            realSpeedToExpectedFine.put(110, 320);
            realSpeedToExpectedFine.put(120, 480);
            realSpeedToExpectedFine.put(121, 700);
        }

        check(realSpeedToExpectedFine, speedRules);
    }

    private static void check(TreeMap<Integer, Integer> realSpeedToExpectedFine, SpeedRules speedRules) {
        // Для каждого значения из списка ожидаемых штрафов для скорости
        for (Entry<Integer, Integer> entry : realSpeedToExpectedFine.entrySet()) {
            // Берем скорость машины
            int realSpeed = entry.getKey();
            // Берем ожидаемый штраф для текущей скорости машины
            int expectedFine = entry.getValue();

            // Вычисляем насколько скорость превышена
            int overSpeed = realSpeed - speedRules.maxSpeed;

            // Вычисляем штраф для такой то превышенной скорости и таких то правилах правилах
            int calculateFine = calculateFine(overSpeed, speedRules);

            if (calculateFine != expectedFine) {
                System.out.println("Неверный штраф " + calculateFine + " для скорости " + realSpeed + "; ожидалось " + expectedFine);
            } else {
                System.out.println("Штраф " + calculateFine + " для скорости " + realSpeed + " рассчитан верно");
            }
        }
    }

    public static int calculateFine(int realOverSpeed, SpeedRules speedRules) {
        // Для каждого значения из списка штрафов для превышенной скорости проверяем
        for (Entry<Integer, Integer> entry : speedRules.overSpeedToFine.entrySet()) {
            // Берем значение превышенной скорости из заданных правил.
            int fineOverSpeed = entry.getKey();
            // Берем штраф для этого значения 
            int fine = entry.getValue();
            // 1. Если скорость машины меньше чем взятое значение fineOverSpeed, то возвращаем штраф
            // 2. Если скорость машины больше в цикле в следующей итерации возьмется следующее значение fineOverSpeed и затем пункт 1.
            // System.out.println("Превышение " + realOverSpeed + "; проверка с " + fineOverSpeed + " штраф если проверка пройдена" + fine);
            if (realOverSpeed < fineOverSpeed) {
                // возвращаем штраф, цикл завершается
                return fine;
            }
        }
        // если штраф для данной скорости не найден, вернется -1. Значит где-то неверно заполнили данные, либо не заполнили вообще.
        return -1;
    }
}