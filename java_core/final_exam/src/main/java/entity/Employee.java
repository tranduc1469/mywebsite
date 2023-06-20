package entity;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.management.relation.Role;

public class Employee extends User{
    private String proSkill;

    public Employee() {
    }

    public Employee(int id, String fullName, String email, String password, Role role, String proSkill) {
        super(id, fullName, email, password, role);
        this.proSkill = proSkill;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
