package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NewFormat {

	protected String printDate() {
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return format.format(Calendar.getInstance().getTime());
	}
}
