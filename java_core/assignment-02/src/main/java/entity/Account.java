package entity;

import java.time.LocalDateTime;

public class Account {
    public int id;
    public String email;
    public String username;
    public String fullName;
    public Department department;
    public Position position;
    public LocalDateTime createdDate;
    public Group[] groups;


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
