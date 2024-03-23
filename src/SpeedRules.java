
import java.util.TreeMap;

public abstract class SpeedRules {
    TreeMap<Integer, Integer> overSpeedToFine;
    int maxSpeed;
}

class TownSpeedRules extends SpeedRules {
    TownSpeedRules() {
        overSpeedToFine = new TreeMap<Integer, Integer>();
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

class NTownSpeedRules extends SpeedRules {
    NTownSpeedRules() {
        overSpeedToFine = new TreeMap<Integer, Integer>();
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
