package ProductManager;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Товара с данным id = " + id + " не найден");
    }
}
