package flowcontrol;

public class SwithCaseDemo {
    public static void main(String[] args) {
       int month = 2;
       switch (month){
           case 2:
               System.out.println("co 28 ngay");
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               System.out.println("co 30 ngay");
               break;
           default:
               System.out.println("co 31 ngay");
               break;

       }
    }
}
