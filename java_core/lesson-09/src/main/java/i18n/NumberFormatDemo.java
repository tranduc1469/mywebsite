package i18n;


import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Locale locale = new Locale("vi","VI");
        NumberFormat formatter = NumberFormat.getInstance(locale);
        String result = formatter.format(9000000000l);
        System.out.println("result = " + result);
    }

}
