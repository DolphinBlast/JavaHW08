public class p38 {
    public static void main(String[] args) throws Exception {
        iVehiclep38[] ivc = new iVehiclep38[2];

        ivc[0] = new Carp38(1234, 20.5);
        ivc[1] = new Planep38(232);

        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show();
        }
    }
}

interface iVehiclep38 {
    int weight = 1000;
    void show();
}

class Carp38 implements iVehiclep38 {
    private int num;
    private double gas;

    public Carp38(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
    }
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class Planep38 implements iVehiclep38 {
    private int flight;

    public Planep38(int f) {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }
    public void show() {
        System.out.println("飛機的班次是" + flight);
    }
}
