public class Challenge3 {
    static int max(int... a) {

        int maxim = Integer.MIN_VALUE;
        for (int it : a) {
            if (it > maxim)
                maxim = it;
        }
        return maxim;
    }

    static double sum(double... a) {
        double sum = 0;
        for (double it : a) {
            sum += it;
        }
        return sum;
    }

    static double discount(double ...prices){
        double dis = 0;
        double totalPrice = sum(prices);
        if(totalPrice  < 500)
        {
            dis = totalPrice - (totalPrice * 0.1);
        }
        else if(totalPrice >= 500){
            dis = totalPrice - (totalPrice * 0.2);
        }
        return dis;
    }

    public static void main(String[] args) {
        System.out.println(max(12, 23, 4, 5, 1, 2, 3, 41, 4, 5));
        System.out.println(sum(1,2,3,4));
        System.out.println(discount(100,200,300,400));
    }
}
