public class p32 {
    public static void main(String[] args) throws Exception {
        Vehiclep32[] vc = new Vehiclep32[2];

        vc[0] = new Carp32(1234, 20.5);
        vc[1] = new Planep32(232);

        for (int i = 0; i < vc.length; i++) {
            if (vc[i] instanceof Carp32) {
                System.out.println("第" + (i + 1) + "個物件是Car類別");
            }
            else
                System.out.println("第" + (i + 1) + "個物件不是Car類別");
        }
    }
}

abstract class Vehiclep32 {
    protected int speed;

    public void setSpeed(int s) {
        speed = s;
        System.out.println("將速度設為" + speed + "了");
    }
    abstract void show();
}

class Carp32 extends Vehiclep32 {
    private int num;
    private double gas;

    public Carp32(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
    }
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

class Planep32 extends Vehiclep32 {
    private int flight;

    public Planep32(int f) {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }
    public void show() {
        System.out.println("飛機的班次是" + flight);
        System.out.println("速度是" + speed);
    }
}
