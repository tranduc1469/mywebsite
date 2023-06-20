package exception;

public class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            throwException();
        } catch (DepartmentNotExistException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public static void throwException() throws DepartmentNotExistException {
        throw new DepartmentNotExistException("Phong ban khong ton tai");

    }
}
