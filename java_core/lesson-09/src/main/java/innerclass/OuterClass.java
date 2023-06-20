package innerclass;

public class OuterClass {
    private static int id;

    public static class InnerClass{
        private String name;

        public InnerClass() {
            System.out.println("id = " + id);
        }

        public void showInfo() {
        }
    }

}
