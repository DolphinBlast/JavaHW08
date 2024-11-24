public class p4 {
    public static void main(String[] args) throws Exception {
        RacingCarp4 rccar = new RacingCarp4();

        rccar.setCar(1234, 20.5);

        rccar.setCourse(5);
    }
}

class Carp4 {
    private int num;
    private double gas;

    public Carp4() {
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

class RacingCarp4 extends Carp4 {
    private int course;

    public RacingCarp4() {
        course = 0;
        System.out.println("生產了賽車");
    }
    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }
}