package entity;

import java.time.LocalDateTime;

public class Group {
    int GroupId;
    String GroupName;
    int CreatorId;
    LocalDateTime createDate;

    public int getGroupId() {
        return GroupId;
    }

    public void setGroupId(int groupId) {
        GroupId = groupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public int getCreatorId() {
        return CreatorId;
    }

    public void setCreatorId(int creatorId) {
        CreatorId = creatorId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "GroupId=" + GroupId +
                ", GroupName='" + GroupName + '\'' +
                ", CreatorId=" + CreatorId +
                ", createDate=" + createDate +
                '}';
    }
}
