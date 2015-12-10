public class Main {

    public static void main(String[] args) {
        Taximeter taximeter = new Taximeter();
        System.out.println("1 km price is : " + taximeter.getPrice(1, 0) + "RMB");
        System.out.println("3 km price is : " + taximeter.getPrice(7, 0) + "RMB");
    }
}
