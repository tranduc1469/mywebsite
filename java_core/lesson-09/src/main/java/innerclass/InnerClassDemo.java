package innerclass;

public class InnerClassDemo {
    public static void main(String[] args) {
        // Inner Class : là 1 class bình thường
        // 1. Nằm trong 1 class khác
        // 2. Có thể truy cập vào phương thức của outer class
        // 3. Có thể khai báo static class

        // Non-static inner Class
        // OuterClass outerClass = new OuterClass();
        // OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        // innerClass.showInfo();


        // Static inner class
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.showInfo();
    }
}
