package Classes;
import Interfaces.Logger;

/*
 * класс ConsoleLogger, реализующий интерфейс Logger, для вывода логов в консоль.
 */
public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
