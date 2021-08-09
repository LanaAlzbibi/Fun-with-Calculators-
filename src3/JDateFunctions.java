public class JDateFunctions {
	private JDate jd;

	public JDateFunctions() {
		jd = new JDate(0);
	}

	public String weekday(String s) {
		String[] a = s.split("\\."); 
		try {

			int day = Integer.parseInt(a[0]);
			int month = Integer.parseInt(a[1]);
			int year = Integer.parseInt(a[2]);

			return jd.Weekday(jd.DateToJulianDate(day, month, year));
			
		} catch (Exception e) {
			return "Enter Valid Formate";
		}
	}

	public String add(String s) {
		// entfernt Leerzeichen
		s = s.replaceAll(" ", ""); 
		// damit man 2 Daten eintragen kann bzw Anzahl der Tage
		String[] date_addedDays = s.split(",");
		// für Tage, Monat, Jahr
		String[] day_month_year = date_addedDays[0].split("\\.");
		
		int jDate = 0, daysadded = 0;

		try {

			int day = Integer.parseInt(day_month_year[0]);
			int month = Integer.parseInt(day_month_year[1]);
			int year = Integer.parseInt(day_month_year[2]);

			jDate = jd.DateToJulianDate(day, month, year);

			daysadded = Integer.parseInt(date_addedDays[1]);

			return jd.JulianDateToDate(jDate + daysadded);
		} catch (Exception e) {
			return "Enter Valid Formate";
		}
	}

	public String subtract(String s) {
		// entfernt Leerzeichen
		s = s.replaceAll(" ", "");
		// damit man 2 Daten eintragen kann bzw Anzahl der Tage
		String[] date_subDays = s.split(",");
		// für Tage, Monat, Jahr
		String[] day_month_year = date_subDays[0].split("\\.");
		
		int jDate = 0, dayssub = 0;

		try {

			int day = Integer.parseInt(day_month_year[0]);
			int month = Integer.parseInt(day_month_year[1]);
			int year = Integer.parseInt(day_month_year[2]);

			jDate = jd.DateToJulianDate(day, month, year);

			dayssub = Integer.parseInt(date_subDays[1]);

			return jd.JulianDateToDate(jDate - dayssub);
		} catch (Exception e) {
			return "Enter Valid Formate";
		}
	}

	public String difference(String s){

		s = s.replaceAll(" ", "");

		String[] firstdate_seconddate = s.split(",");

		String[] firstdate = firstdate_seconddate[0].split("\\.");
		String[] seconddate = firstdate_seconddate[1].split("\\.");

		try {

			int day = Integer.parseInt(firstdate[0]);
			int month = Integer.parseInt(firstdate[1]);
			int year = Integer.parseInt(firstdate[2]);

			int day1 = Integer.parseInt(seconddate[0]);
			int month1 = Integer.parseInt(seconddate[1]);
			int year1 = Integer.parseInt(seconddate[2]);

			return "" + jd.DateDifference(jd.DateToJulianDate(day, month, year),
					jd.DateToJulianDate(day1, month1, year1));

		} catch (Exception e) {

			return "Enter Valid Formate";
		}
	}
}