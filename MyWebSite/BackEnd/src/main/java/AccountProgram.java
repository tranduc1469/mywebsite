import entity.Account;
import repository.AccountRepository;

import java.util.List;

public class AccountProgram {
    public static void main(String[] args) {
        AccountRepository repository = new AccountRepository();

        // Test create
        Account account1 = new Account();
        account1.setName("Duc");
        account1.setType(Account.Type.ADMIN);
        repository.create(account1);

        Account account2 = new Account();
        account2.setName("Khoa");
        account2.setType(Account.Type.USER);
        repository.create(account2);

        // Test default
        Account account4 = new Account();
        account4.setName("Tung");
        repository.create(account4);

        // Test find all
        List<Account> accounts = repository.findAl();
        for (Account account : accounts) {
            System.out.println("account = " + account);
        }

        // Test Update
//        Account account3 = repository.findById(2);
//        account3.setType(Account.Type.ADMIN); // Vì trường name trong database để là unique nên sẽ không thể đặt trùng
//        repository.update(account3);

    }
}
