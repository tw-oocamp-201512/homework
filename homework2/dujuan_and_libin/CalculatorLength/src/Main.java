public class Main {

    public static void main(String[] args) {
        Length lengthOne = new Length(1, LengthType.M);
        Length lengthTwo = new Length(10, LengthType.CM);
        Length lengthThree = new Length(5, LengthType.MM);
        Length length = lengthOne.divide(4).add(lengthTwo.multiply(3)).subtract(lengthThree);

        System.out.println("**********");
        System.out.println(length.transfer(LengthType.CM).toString()); //54.5CM
        System.out.println("**********");
    }
}
