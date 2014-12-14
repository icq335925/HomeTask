package monitor;
import java.io.File;
import java.util.Date;

public class Monitor {
	String file;
    String[] list;
	IFileEvent event;
    Date date;

	public Monitor(String file, IFileEvent event) {
		this.file = file;
		this.event = event;
	}
    public Monitor(String[] list, IFileEvent event) {
        this.list = list;
        this.event = event;
    }

	public void start() {
        for (int i = 0; i <list.length; i++) {
        File f = new File(list[i]);
        while (true) {
			if (f.exists() && f.isFile()) {
				if (event != null)
					event.onFileAdded(list[i]);
                    Date dd = new Date(f.lastModified());
                    event.onFileDate(dd);
				break;
			}
            delay(); // задержка
            System.out.println("Waiting...");
		}
        }
	}

    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
            System.err.println("Thread interrupted!");
        }
    }

}
