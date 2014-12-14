package monitor;

import java.util.Date;

/**
 * Монитор ждет пока указанный файл будет создан,
 * после чего выполнение завершается.
 */
public class MonitorDemo {
	public static void main(String[] args) {
		Monitor m = new Monitor("1.txt", new FileEvent());
//        m.start();
        String[] list = {"1.txt", "2.txt", "3.txt"};
        Monitor n = new Monitor(list, new FileEvent());
           n.start();
	}
}