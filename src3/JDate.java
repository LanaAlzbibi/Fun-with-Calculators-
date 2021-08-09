
// von Jimmy s0575805 3. Semester

public class JDate {
	
	private int GivenDate;

	public JDate(int day, int month, int year) {
		this.GivenDate = this.DateToJulianDate(day, month, year);
	}

	public JDate(int julianDate) {
		this.GivenDate = julianDate;
	}

	public int DateToJulianDate(int day, int month, int year) {
		int julianDate;		
		julianDate = day - 32075 + 1461 * (year + 4800 + (month - 14) / 12) / 4 
				     + 367 * (month - 2 - (month - 14) / 12 * 12) / 12 - 3 * 
				     ((year + 4900 + (month - 14) / 12) / 100) / 4;
		
		return julianDate;
	}

	public String JulianDateToDate(int jDate) {
		String Date;
		
		int l, n, r, i, t, j, v;
		
		l = jDate + 68569;
		n = 4 * l / 146097;
		r = l - (146097 * n + 3) / 4;
		i = 4000 * (r + 1) / 1461001;
		t = r - 1461 * i / 4 + 31;
		j = 80 * t / 2447;
		v = j / 11;

		int day = t - 2447 * j / 80;
		int month = j + 2 - 12 * v;
		int year = 100 * (n - 49) + i + v;

		if (month < 10) {			
			Date = day + ".0" + month + "." + year;
		} else {
			Date = day + "." + month + "." + year;
		}

		return Date;
	}


	public String Weekday(int jDate) {
		int weekdays = (int) ((jDate + 1.5) % 7);
		switch (weekdays) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Error";
		}
		
	}
	
	public int DateDifference(int jDate1, int jDate2) {
		return Math.abs(jDate1 - jDate2);
	}
}