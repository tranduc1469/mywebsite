package entity;

import java.time.LocalDateTime;

public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDateTime createdDate;

    @Override
    public String toString() {
        return "backend.Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
