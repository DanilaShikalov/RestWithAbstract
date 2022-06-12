package generic.demo.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Long id) {
        super("Entity with id = " + id + " is not found");
    }
}
