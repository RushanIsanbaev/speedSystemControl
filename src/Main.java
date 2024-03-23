public class Main {

    int carSpeed = 50;
    //evro = " €";
    static boolean istown = true;




    public static void main(String[] args) {


        if (istown == true){

            System.out.println("Система расчёта штрафов в населеном пункте");

            check(49, 0);
            check(50, 30);
            check(65, 50);
            check(70, 70);
            check(75, 115);
            check(80, 180);
            check(90, 260);
            check(100, 400);
            check(110, 560);
            check(120, 700);
            check(121, 800);
        }
        else {
        System.out.println("Система расчёта штрафов вне населенного пункта");

        ncheck(49, 0);
        ncheck(50, 20);
        ncheck(65, 30);
        ncheck(70, 60);
        ncheck(75, 100);
        ncheck(80, 150);
        ncheck(90, 200);
        ncheck(100, 320);
        ncheck(110, 480);
        ncheck(120, 600);
        ncheck(121, 700);
        }
    }
    public static void check(int carSpeed, int fine)
    {

        if(calculateFine(carSpeed) != fine) {
            System.out.println("Неверный штраф " + fine +" для скорости " + carSpeed);
        }
        else {
            System.out.println("Штраф " + fine + " для скорости " + carSpeed + " рассчитан верно");
        }
    }
    public static void ncheck(int carSpeed, int nfine)
    {

        if(ncalculateFine(carSpeed) != nfine) {
            System.out.println("Неверный штраф " + nfine + " для скорости " + carSpeed);
        }
        else {
            System.out.println("Штраф " + nfine + " для скорости " + carSpeed + " рассчитан верно");
        }
    }

    public static int calculateFine(int carSpeed){
        int townSpeed = 50;

        int overSpeed = carSpeed - townSpeed;

        System.out.println("Система расчёта штрафов в Германии");

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


        if (istown == true)
        {


            if (overSpeed >= 1 && overSpeed <= 10) {
                return fineFor1to10;
            } else if (overSpeed >= 11 && overSpeed <= 15) {
                return fineFor11to15;
            } else if (overSpeed >= 16 && overSpeed <= 20) {
                return fineFor16to20;
            } else if (overSpeed >= 21 && overSpeed <= 25) {
                return fineFor21to25;
            } else if (overSpeed >= 26 && overSpeed <= 30) {
                return fineFor26to30;
            } else if (overSpeed >= 31 && overSpeed <= 40) {
                return fineFor31to40;
            } else if (overSpeed >= 41 && overSpeed <= 50) {
                return fineFor41to50;
            } else if (overSpeed >= 51 && overSpeed <= 60) {
                return fineFor51to60;
            } else if (overSpeed >= 61 && overSpeed <= 70) {
                return fineFor61to70;
            }
            {
                return fineFor71andMore;
            }
        }
    }
    public static int ncalculateFine(int carSpeed) {
        int ntownSpeed = 60;
        int noverSpeed = carSpeed - ntownSpeed;
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

        if (noverSpeed >= 1 && noverSpeed <= 10) {
                return nfineFor1to10;
        } else if (noverSpeed >= 11 && noverSpeed <= 15) {
                return nfineFor11to15;
        } else if (noverSpeed >= 16 && noverSpeed <= 20) {
                return nfineFor16to20;
        } else if (noverSpeed >= 21 && noverSpeed <= 25) {
                return nfineFor21to25;
        } else if (noverSpeed >= 26 && noverSpeed <= 30) {
                return nfineFor26to30;
        } else if (noverSpeed >= 31 && noverSpeed <= 40) {
                return nfineFor31to40;
        } else if (noverSpeed >= 41 && noverSpeed <= 50) {
                return nfineFor41to50;
        } else if (noverSpeed >= 51 && noverSpeed <= 60) {
                return nfineFor51to60;
        } else if (noverSpeed >= 61 && noverSpeed <= 70) {
                return nfineFor61to70;
        }
        {
                return nfineFor71andMore;
        }
    }
}