import org.apache.log4j.Logger;

/**
 * Created by Настя on 17.07.2017.
 */
public class LogImpl {
    private static final Logger log = Logger.getLogger(LogImpl.class);
    public void calc() {
        log.trace("hhhhhhfdddd");
    }
    public void f() {
        log.error("mmmm", new NullPointerException());
    }
}
