class TV {
    public void changeVolume() {
        System.out.println("Tv volume changed");
    }

    public void changeChannel() {
        System.out.println("Tv channel is changed");
    }
}

class SmartTv extends TV {
    public void changeVolume() {
        System.out.println("Smart tv volume changed");
    }

    public void changeChannel() {
        System.out.println("Smart tv channel is changed");
    }

    public void browse() {
        System.out.println("Browsing in smart tv");
    }
}

public class MethodOverridingExample1 {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.changeChannel();
        tv1.changeVolume();

        SmartTv tv2 = new SmartTv();
        tv2.changeChannel();
        tv2.changeVolume();
        tv2.browse();

        TV tv3 = new SmartTv();
        tv3.changeChannel();
        tv3.changeVolume();
    }
}
