
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
        overSpeedToFine.put(10, 30);
        overSpeedToFine.put(15, 50);
        overSpeedToFine.put(20, 70);
        overSpeedToFine.put(25, 115);
        overSpeedToFine.put(30, 180);
        overSpeedToFine.put(40, 260);
        overSpeedToFine.put(50, 400);
        overSpeedToFine.put(60, 560);
        overSpeedToFine.put(70, 700);
        overSpeedToFine.put(71, 800);

        maxSpeed = 50;
    }
}

// Наследник класса для правил загорода, заполняются правила для загорода
class NTownSpeedRules extends SpeedRules {
    NTownSpeedRules() {
        overSpeedToFine = new TreeMap<Integer, Integer>();
        // слева превышение до 10, справа штраф для такого превышения (20)
        overSpeedToFine.put(10, 20);
        overSpeedToFine.put(15, 30);
        overSpeedToFine.put(20, 60);
        overSpeedToFine.put(25, 100);
        overSpeedToFine.put(30, 150);
        overSpeedToFine.put(40, 200);
        overSpeedToFine.put(50, 320);
        overSpeedToFine.put(60, 480);
        overSpeedToFine.put(70, 600);
        overSpeedToFine.put(71, 700);

        maxSpeed = 60;
    }
}
