public class p41 {
    public static void main(String[] args) throws Exception {
        Carp41 car = new Carp41(1234, 20.5);

        car.vShow();
        car.mShow();
    }
}

interface iVehiclep41 {
    int weight = 1000;
    void vShow();
}

interface iMaterialp41 {
    void mShow();
}

class Carp41 implements iVehiclep41, iMaterialp41 {
    private int num;
    private double gas;

    public Carp41(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
    }
    public void vShow() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
    public void mShow() {
        System.out.println("車子的材質是鐵");
    }
}