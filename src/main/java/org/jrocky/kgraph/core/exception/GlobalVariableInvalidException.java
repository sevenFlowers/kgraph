package org.jrocky.kgraph.core.exception;
/**
 * 全局变量不合法异常
 * @author wangzhijie
 *
 */
public class GlobalVariableInvalidException extends RuntimeException {
	private static final long serialVersionUID = 8833107280462416707L;

	/**
     * Constructs an GlobalVariableInvalidException with no detail message.
     */
    public GlobalVariableInvalidException() {
    }

    /**
     * Constructs an GlobalVariableInvalidException with the specified
     * detail message.
     *
     * @param message the detail message
     */
    public GlobalVariableInvalidException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.
     *
     * <p>Note that the detail message associated with <code>cause</code> is
     * <i>not</i> automatically incorporated in this exception's detail
     * message.
     *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link Throwable#getMessage()} method).
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link Throwable#getCause()} method).  (A <tt>null</tt> value
     *         is permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @since 1.5
     */
    public GlobalVariableInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new exception with the specified cause and a detail
     * message of <tt>(cause==null ? null : cause.toString())</tt> (which
     * typically contains the class and detail message of <tt>cause</tt>).
     * This constructor is useful for exceptions that are little more than
     * wrappers for other throwables (for example, {@link
     * java.security.PrivilegedActionException}).
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link Throwable#getCause()} method).  (A <tt>null</tt> value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @since  1.5
     */
    public GlobalVariableInvalidException(Throwable cause) {
        super(cause);
    }
}