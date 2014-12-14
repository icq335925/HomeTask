package monitor;

import java.util.Date;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s) {
		System.out.println("File added: " + s);
	}
    @Override
    public void onFileDate(Date d) {
        System.out.println("File date: " + d);
    }
}
