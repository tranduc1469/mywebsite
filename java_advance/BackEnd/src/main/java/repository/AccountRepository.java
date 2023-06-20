package repository;

import entity.Account;
import org.hibernate.Session;
import utils.HibernateUtils;

import java.util.List;

public class AccountRepository {
    public List<Account> findAl() {
        try(Session session = HibernateUtils.openSession()) {
            return session
                    .createQuery("FROM Account", Account.class)
                    .getResultList();
            // Thực thi câu lệnh và chuyển hóa về từng đối tượng trong Account
            // getResultList: Trả về 1 danh sách vì dữ liệu trả về là 1 List
        }
    }

    public Account findById(int id) {
        try (Session session = HibernateUtils.openSession()) {
            return session.get(Account.class, id);
        }
    }

    public List<Account> findByName(String name) {
        try (Session session = HibernateUtils.openSession()) {
            return session
                    .createQuery("FROM Account WHERE name= :name", Account.class)
                    .setParameter("name",name)
                    .getResultList();
            // Trả về 1 phần tử vì để unique ở phần database
        }
    }

    // Thêm mới không có dữ liệu trả về nên kiểu dữ liệu trả về là void
    // Và không cần return dữ liệu
    public void create(Account account) {
        try (Session session = HibernateUtils.openSession()) {
            session.beginTransaction();
            // Khi chỉnh sửa dữ liệu trong database phải dùng câu lệnh beginTransaction()
            session.persist(account);// persist: tạo
            session.getTransaction().commit(); // Thực thi câu lệnh để hoàn thành phiên làm việc
        }
    }

    public void update(Account account) {
        try (Session session = HibernateUtils.openSession()) {
            session.beginTransaction();
            // Khi chỉnh sửa dữ liệu trong database phải dùng câu lệnh beginTransaction()
            session.merge(account);// merge: cập nhật
            session.getTransaction().commit(); // Thực thi câu lệnh để hoàn thành phiên làm việc
        }
    }

    public void deleteById(int id) {
        try (Session session = HibernateUtils.openSession()) {
            session.beginTransaction();
            Account account = session.get(Account.class,id);
            session.delete(account);
            session.getTransaction().commit();
        }
    }

//    public boolean existById(int id) {
//        return findById(id) != null;
//    }

//    public boolean name(String name) {
//        return findByName(name) != null;
//    }
}
