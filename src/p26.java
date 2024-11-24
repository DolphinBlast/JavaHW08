public class p26 {
    public static void main(String[] args) throws Exception {
        Carp26[] car = new Carp26[2];

        car[0] = new Carp26();
        car[1] = new RacingCarp26();

        for (int i = 0; i < car.length; i++) {
            Class cl = car[i].getClass();
            System.out.println("第" + (i+1) + "個物件類別是" + cl);
        }
    }
}

class Carp26 {
    protected int num;
    protected double gas;

    public Carp26() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
}

class RacingCarp26 extends Carp26 {
    public RacingCarp26() {
        System.out.println("生產了賽車");
    }
}