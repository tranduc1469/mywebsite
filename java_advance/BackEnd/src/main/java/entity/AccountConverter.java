package entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter // Bộ chuyển đổi
public class AccountConverter implements AttributeConverter<Account.Type, Character> {
    // Chuyển từ chữ nhiếu sang chữ ít
    // Chuyển tug java sang DB
    @Override
    public Character convertToDatabaseColumn(Account.Type type) {
        return type.toString().charAt(0);
    }

    // Chuyển từ chữ ít sang chữ nhiều
    // Chuyển từ DB sang Java
    @Override
    public Account.Type convertToEntityAttribute(Character character) {
        return Account.Type.fromCode(character);
    }
}
