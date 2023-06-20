package backend;

import java.time.LocalDateTime;

public class Account {
    int id;
    String email;
    String username;
    String firtsname;
    String lastname;
    String fullname;
    String position;
    LocalDateTime creatdate;
    public Account() {
    }

    public Account(int id, String email, String username, String firtsname, String fullname) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firtsname = firtsname;
        this.fullname = fullname;
    }

    public Account(int id, String email, String username, String firtsname, String fullname, String position, LocalDateTime creatdate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firtsname = firtsname;
        this.fullname = lastname + lastname;
        this.position = position;
        this.creatdate = LocalDateTime.now();
    }

    public Account(int id, String email, String username, String firtsname, String lastname, String fullname, String position, LocalDateTime creatdate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.fullname = fullname;
        this.position = position;
        this.creatdate = creatdate;
    }
}
