public class Program {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.setId(1);
        department1.setName("Giam Doc");

        Department department2 = new Department();
        department2.setId(2);
        department2.setName("Nhan vien");

        Account account1 = new Account();
        account1.setId(1);
        account1.setName("Duc");
        account1.setDepartment(department1);
        System.out.println("account1 = " + account1);

        Account account2 = new Account();
        account2.setId(2);
        account2.setName("Phuong");
        account2.setDepartment(department2);
        System.out.println("account2 = " + account2);




        if (account1.getId() == 1) {
            System.out.println("department1 = " + department1);
        } else if(account1.getId() == 2) {
            System.out.println("Nhan vien chua vao phong ban nay");
        }

        switch (account1.getId()){
            case 1:
                System.out.println("department1 = " + department1);
                break;
            case 2:
                System.out.println("Nhan vien chua vao phong ban nay");
                break;
        }
    }
}
