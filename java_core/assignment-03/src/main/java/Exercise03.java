public class Exercise03 {
    public static void main(String[] args) {
        Integer luonglau = 5000;
        luonglau.floatValue();
        System.out.printf("luonglau.floatValue() = , %.2f" , luonglau.floatValue());

        int number = Integer.parseInt("1234567");
        System.out.println("number = " + number);

        Integer number2 = Integer.valueOf(1234567) ;
        System.out.println("number2 = " + number2);


    }
}
