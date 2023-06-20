package gc;

public class GarbargeCollectorDemo {
    public static void main(String[] args) {
        // Máy ảo Java sẽ tự động dọn


        // Bộ nhớ sẽ bị dọn khi
        // 1. Đối tượng đó bị mất liên kết
        Animal animal1 = new Animal("Dog");
        animal1 = null;
        // 2. Biến cục bộ
        demo();

        // Có thể chủ động dọn rác
        System.gc();
    }

    public static void  demo(){
        Animal animal = new Animal("Cat");

    }
}
