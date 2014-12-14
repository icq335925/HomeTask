package monitor;

import java.util.Date;

public interface IFileEvent {
	void onFileAdded(String s);
    void onFileDate(Date d);
}
