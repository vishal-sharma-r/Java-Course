class Hide {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0)
            length = 0;
        else
            this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        if (breadth < 0)
            breadth = 0;
        else
            this.breadth = breadth;
    }

}

public class DataHiding {
    public static void main(String[] args) {
        Hide h1 = new Hide();
        h1.setLength(-2);
        h1.setBreadth(2);
        System.out.println(h1.getLength() + " " + h1.getBreadth());

    }
}
