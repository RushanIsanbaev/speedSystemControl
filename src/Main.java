//TIP To <=b>Run<=/b> code, press <=shortcut actionId="Run"/> or
// click the <=icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта штрафов в Германии");

        int carSpeed = 70;

        String curenci = " €";

        int[] massiv = {30, 50, 70, 115, 180, 260, 400, 560, 700, 800};

        int[] marks = {20, 30, 60, 100, 150, 200, 320, 480, 600, 700};
        int townSpeed = 50;

        int ntownSpeed = 60;

        boolean istown = true;

        int overSpeed = carSpeed - townSpeed;
        int noverSpeed = carSpeed - ntownSpeed;
        if (istown == true) {

            fine(overSpeed, massiv, curenci);

        } else {
            fine(noverSpeed, marks, curenci);


        }
    }
    private static void fine(int noverSpeed, int[] nfine, String curenci){
        if (noverSpeed >= 1 && noverSpeed <= 10) {
            System.out.println("Штраф: " + nfine[0] + curenci);
        } else if (noverSpeed >= 11 && noverSpeed <= 15) {
            System.out.println("Штраф: " + nfine[1] + curenci);
        } else if (noverSpeed >= 16 && noverSpeed <= 20) {
            System.out.println("Штраф: " + nfine[2] + curenci);
        } else if (noverSpeed >= 21 && noverSpeed <= 25) {
            System.out.println("Штраф: " + nfine[3] + curenci);
        } else if (noverSpeed >= 26 && noverSpeed <= 30) {
            System.out.println("Штраф: " + nfine[4] + curenci);
        } else if (noverSpeed >= 31 && noverSpeed <= 40) {
            System.out.println("Штраф: " + nfine[5] + curenci);
        } else if (noverSpeed >= 41 && noverSpeed <= 50) {
            System.out.println("Штраф: " + nfine[6] + curenci);
        } else if (noverSpeed >= 51 && noverSpeed <= 60) {
            System.out.println("Штраф: " + nfine[7] + curenci);
        } else if (noverSpeed >= 61 && noverSpeed <= 70) {
            System.out.println("Штраф: " + nfine[8] + curenci);
        } else if (noverSpeed >= 71) {
            System.out.println("Штраф: " + nfine[9] + curenci);
        }
    }
}
