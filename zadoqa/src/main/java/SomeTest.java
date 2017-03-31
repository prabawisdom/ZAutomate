import java.util.Calendar;

import org.apache.commons.lang3.time.DateFormatUtils;

public class SomeTest {

    public static void main(String[] args) {

	Calendar cal = Calendar.getInstance();
	System.out.println(DateFormatUtils.format(cal, "dd-MM-yy, hh.mmaa"));

    }
}
