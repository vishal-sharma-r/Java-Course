class HondaCity {
    /* Static variable */
    static double price = 10;

    void show() {
        System.out.println(price);
    }

    void display() {
        System.out.println(price);
    }

    void setPrice(double newPrice) {
        price = newPrice;
    }

    static double onRoadPrice(String city) {
        switch (city) {
            case "delhi":
                return price + price * 0.1;
            case "jk":
                return price + price * 0.09;
            default:
                return price;
        }
    }

}

public class StaticPractice {
    public static void main(String[] args) {
        HondaCity hc = new HondaCity();
        System.out.println(HondaCity.price);
        
        hc.display();
        hc.show();
        hc.setPrice(100);
        hc.display();
        hc.show();
        System.out.println(HondaCity.onRoadPrice("delhi"));
        HondaCity.price = 150;
        System.out.println(HondaCity.onRoadPrice("jk"));

    }
}
