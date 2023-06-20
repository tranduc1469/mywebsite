package primitive;

public class DefaultValueDemo {
    public static void main(String[] args) {
        // Giá trị mặc định
        // Kiểu số sẽ là 0
        // Kiểu char \u0000
        // kiểu boolean là false
        // kiểu object là null


        DefaultValue defaultValue = new DefaultValue();
        System.out.println("defaultValue.b = " + defaultValue.b);
        System.out.println("defaultValue.s = " + defaultValue.s);
        System.out.println("defaultValue.i = " + defaultValue.i);
        System.out.println("defaultValue.f = " + defaultValue.f);
        System.out.println("defaultValue.d = " + defaultValue.d);
        System.out.println("defaultValue.str = " + defaultValue.str);
        System.out.println("defaultValue.c = " + defaultValue.c);

    }
}
