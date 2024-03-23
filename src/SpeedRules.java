
import java.util.TreeMap;

// Объявляем класс который описывает общие правила скорости
public abstract class SpeedRules {
    TreeMap<Integer, Integer> overSpeedToFine;
    int maxSpeed;
}

// Наследник класса для правил города, заполняются правила для города
class TownSpeedRules extends SpeedRules {
    TownSpeedRules() {
        overSpeedToFine = new TreeMap<Integer, Integer>();
        // слева превышение до 10, справа штраф для такого превышения
        overSpeedToFine.put(0, 0);
        overSpeedToFine.put(11, 30);
        overSpeedToFine.put(16, 50);
        overSpeedToFine.put(21, 70);
        overSpeedToFine.put(26, 115);
        overSpeedToFine.put(31, 180);
        overSpeedToFine.put(41, 260);
        overSpeedToFine.put(51, 400);
        overSpeedToFine.put(61, 560);
        overSpeedToFine.put(71, 700);
        overSpeedToFine.put(72, 800);
        // 100 - 50 = 50
        // 50 < 51 -> 260
        maxSpeed = 50;
    }
}

// Наследник класса для правил загорода, заполняются правила для загорода
class NTownSpeedRules extends SpeedRules {
    NTownSpeedRules() {
        overSpeedToFine = new TreeMap<Integer, Integer>();
        // слева превышение до 10, справа штраф для такого превышения (20)
        overSpeedToFine.put(0, 0);
        overSpeedToFine.put(11, 20);
        overSpeedToFine.put(16, 30);
        overSpeedToFine.put(21, 60);
        overSpeedToFine.put(26, 100);
        overSpeedToFine.put(31, 150);
        overSpeedToFine.put(41, 200);
        overSpeedToFine.put(51, 320);
        overSpeedToFine.put(61, 480);
        overSpeedToFine.put(71, 600);
        overSpeedToFine.put(72, 700);

        // 75 - 60 = 15
        // 30
        maxSpeed = 60;
    }
}
