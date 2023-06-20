package entity;

import java.time.LocalDateTime;

public class GroupAccount {
    Group groupId;
    Account accountId;
    LocalDateTime joinDate;

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "GroupAccount{" +
                "groupId=" + groupId +
                ", accountId=" + accountId +
                ", joinDate=" + joinDate +
                '}';
    }
}
