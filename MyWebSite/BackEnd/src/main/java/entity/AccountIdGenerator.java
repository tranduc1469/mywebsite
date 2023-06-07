package entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class AccountIdGenerator implements IdentifierGenerator {
    //    private String prefix = "Acc";

    // Chức năng: Sinh ra giá trị cho khóa chính
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
        Account account = (Account) obj;
        long count = session
                .createQuery("SELECT COUNT(id) FROM Account",Long.class)
                .uniqueResult();
        return String.format("%s-%d", account.getType().toString().charAt(0),count+1);
    };
}
