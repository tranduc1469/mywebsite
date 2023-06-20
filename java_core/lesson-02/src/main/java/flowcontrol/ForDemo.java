package flowcontrol;

public class ForDemo {
    public static void main(String[] args) {
        String [] fruits = {"cam","le","tao","quyt"};
        // min =0 , max = length - 1
        for (int i = 0; i < fruits.length;i = i + 1){
            System.out.println("fruits[i] = " + fruits[i]);
        }

        for(String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }
    }
}
