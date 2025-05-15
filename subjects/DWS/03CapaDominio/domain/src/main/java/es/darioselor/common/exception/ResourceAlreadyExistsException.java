package es.darioselor.common.exception;

public class ResourceAlreadyExistsException extends RuntimeException {
    private static final String DESRIPTION = "Resource already exists";
    public ResourceAlreadyExistsException(String message) {
        super(DESRIPTION + ". " + message);
    }
}
