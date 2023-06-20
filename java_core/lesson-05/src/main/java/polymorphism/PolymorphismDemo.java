package polymorphism;

// Polymorphism : Tính đa hình
// Tương tự ép kiểu dữ liệu từ nhỏ sang lớn
// instanceof : kiểm tra đôi tượng or thực thể thuộc class nào

public class PolymorphismDemo {
    // Truyền vào con vật có tiếng kêu của chúng

    public static void makeSound(Animal animal){
        animal.makeSound();
    }



    public static void main(String[] args) {


        Animal dog = new Dog(1,"Shiba");
        System.out.println("dog = " + dog);
        makeSound(dog);

        Animal bird = new Bird(2,"Dai bang");
        System.out.println("bird = " + bird);
        makeSound(bird);


        Animal[] animals = {dog,bird};
        for (Animal animal : animals) {
            if (animal instanceof Dog){
                System.out.println(animal.getName()+ " is Dog.");
            } else if (animal instanceof Bird) {
                System.out.println(animal.getName()+ " is Bird.");

            }
        }

    }

}
