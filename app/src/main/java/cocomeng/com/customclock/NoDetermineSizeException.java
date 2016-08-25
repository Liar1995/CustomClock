package cocomeng.com.customclock;

/**
 * Created by Sunmeng Data:2016-08-25
 * E-Mail:Sunmeng1995@outlook.com
 * Description:
 */
public class NoDetermineSizeException extends Exception {
    private final static String DEFAULT_DBNAME = "NoDetermineSizeException";

    public NoDetermineSizeException(String message) {
        super(message);
    }

}
