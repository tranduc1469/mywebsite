package entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

//@Entity: Định nghĩa Class ứng với 1 table ở database
@Entity
//@Table; Cung cấp thông tin thêm về table
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "id", nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cấu hình tự động tăng
    @GenericGenerator( //@GenericGenerator : Dùng khi id do người dùng tự định nghĩa
            name = "account_id",
            strategy = "entity.AccountIdGenerator" // strategy: Phải truyền đường dẫn đến file vừa  viết
    )
    @GeneratedValue(generator = "account_id") //Khi id người dùng tự đặt phải dùng thêm @GeneratedValue
    private String id;                        // Không dùng từ khóa strategy mà dùng generator và truyền tên cột account_id

    @Column(name = "name",length = 50, nullable = false)
    // Để giá trị mặc định nếu người dùng không nhập vào
    private String name;

    @Column(name = "type", nullable = false)
    @Enumerated(value = EnumType.STRING) // ORDINAL: Chuyển từ chữ sang số
                                           // STRING: Trên java thế nào thì database như vậy
//    @Convert(converter = AccountConverter.class) // Áp dụng bọ chuyển đổi khi lưu Type vào database
    private Type type = Type.USER;

    public enum Type {
        ADMIN, USER;

        public static Type fromCode(char code) {
            if (code == 'A'){
                return ADMIN;
            }
            if (code == 'U' ){
                return USER;
            }
            return null;
        }
    }
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp // Tự động lấy thời gian hiện tại làm giá trị
    private LocalDateTime createdAt;

    @Column(name = "update_at", nullable = false)
    @UpdateTimestamp //Tự động lấy thời gian hiện tại để cập nhật
    private LocalDateTime updateAt;

//    @PrePersist: Thực thi câu lệnh trước khi thêm vào database
//    @Post: Thực thi câu lệnh sau khi thêm vào database


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
