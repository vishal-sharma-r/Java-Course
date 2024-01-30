class Phone {
    public void call() {
        System.out.println("Call from the phone");
    }

    public void sms() {
        System.out.println("sms from the Phone");
    }

}

interface ICamera {
    void click();

    void record();
}

interface IMusicPlayer {
    void play();

    void stop();
}

class SmartPhone extends Phone implements IMusicPlayer, ICamera {
    public void videoCall() {
        System.out.println("Smart Phone video call");
    }

    public void click() {
        System.out.println("Smart Phone click");
    }

    public void record() {
        System.out.println("smart phone record");
    }
    public void play(){
        System.out.println("Smart Phone play");
    }

    public void stop(){
        System.out.println("Smart phone stop");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.play();
        sp.sms();

        IMusicPlayer sp1 = new SmartPhone();
        sp1.play();
    }
}
