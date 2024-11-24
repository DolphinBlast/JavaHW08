public class p17 {
    public static void main(String[] args) throws Exception {
        Carp17 car[] = new Carp17[2];

        car[0] = new Carp17();
        car[0].setCar(1234, 20.5);

        car[1] = new RacingCarp17();
        car[1].setCar(4567, 30.5);

        for (int i = 0; i < car.length; i++) {
            car[i].show();
        }
    }
}

class Carp17 {
    protected int num;
    protected double gas;

    public Carp17() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + ",汽油量設為" + gas);
    }
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCarp17 extends Carp17 {
    private int course;

    public RacingCarp17() {
        course = 0;
        System.out.println("生產了賽車");
    }
    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }
    public void show() {
        System.out.println("賽車的車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
}