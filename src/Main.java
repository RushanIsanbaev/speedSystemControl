//TIP To <=b>Run<=/b> code, press <=shortcut actionId="Run"/> or
// click the <=icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта штрафов в Германии");

        int carSpeed = 70;

        int fineFor1to10 = 30;
        int fineFor11to15 = 50;
        int fineFor16to20 = 70;
        int fineFor21to25 = 115;
        int fineFor26to30 = 180;
        int fineFor31to40 = 260;
        int fineFor41to50 = 400;
        int fineFor51to60 = 560;
        int fineFor61to70 = 700;
        int fineFor71andMore = 800;


        int nfineFor1to10 = 20;
        int nfineFor11to15 = 30;
        int nfineFor16to20 = 60;
        int nfineFor21to25 = 100;
        int nfineFor26to30 = 150;
        int nfineFor31to40 = 200;
        int nfineFor41to50 = 320;
        int nfineFor51to60 = 480;
        int nfineFor61to70 = 600;
        int nfineFor71andMore = 700;

        int townSpeed = 50;

        int ntownSpeed = 60;

        boolean istown = false;

        int overSpeed = carSpeed - townSpeed;
        int noverSpeed = carSpeed - ntownSpeed;
        if (istown == true) {



            if (overSpeed >= 1 && overSpeed <= 10) {
                System.out.println("Штраф: " + fineFor1to10);
            } else if (overSpeed >= 11 && overSpeed <= 15) {
                System.out.println("Штраф: " + fineFor11to15);
            } else if (overSpeed >= 16 && overSpeed <= 20) {
                System.out.println("Штраф: " + fineFor16to20);
            } else if (overSpeed >= 21 && overSpeed <= 25) {
                System.out.println("Штраф: " + fineFor21to25);
            } else if (overSpeed >= 26 && overSpeed <= 30) {
                System.out.println("Штраф: " + fineFor26to30);
            } else if (overSpeed >= 31 && overSpeed <= 40) {
                System.out.println("Штраф: " + fineFor31to40);
            } else if (overSpeed >= 41 && overSpeed <= 50) {
                System.out.println("Штраф: " + fineFor41to50);
            } else if (overSpeed >= 51 && overSpeed <= 60) {
                System.out.println("Штраф: " + fineFor51to60);
            } else if (overSpeed >= 61 && overSpeed <= 70) {
                System.out.println("Штраф: " + fineFor61to70);
            } else if (overSpeed >= 71) {
                System.out.println("Штраф: " + fineFor71andMore);
            }
        } else {
            if (noverSpeed >= 1 && noverSpeed <= 10) {
                System.out.println("Штраф: " + nfineFor1to10);
            } else if (noverSpeed >= 11 && noverSpeed <= 15) {
                System.out.println("Штраф: " + nfineFor11to15);
            } else if (noverSpeed >= 16 && noverSpeed <= 20) {
                System.out.println("Штраф: " + nfineFor16to20);
            } else if (noverSpeed >= 21 && noverSpeed <= 25) {
                System.out.println("Штраф: " + nfineFor21to25);
            } else if (noverSpeed >= 26 && noverSpeed <= 30) {
                System.out.println("Штраф: " + nfineFor26to30);
            } else if (noverSpeed >= 31 && noverSpeed <= 40) {
                System.out.println("Штраф: " + nfineFor31to40);
            } else if (noverSpeed >= 41 && noverSpeed <= 50) {
                System.out.println("Штраф: " + nfineFor41to50);
            } else if (noverSpeed >= 51 && noverSpeed <= 60) {
                System.out.println("Штраф: " + nfineFor51to60);
            } else if (noverSpeed >= 61 && noverSpeed <= 70) {
                System.out.println("Штраф: " + nfineFor61to70);
            } else if (noverSpeed >= 71) {
                System.out.println("Штраф: " + nfineFor71andMore);
            }
        }
    }
}
