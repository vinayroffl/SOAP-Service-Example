package r.vinay.business;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import r.vinay.model.Person;
import r.vinay.model.PersonResponse;

public class BusinessService {

	public static PersonResponse processLogic(Person p) {
		PersonResponse pr = new PersonResponse();
		pr.setAge(calculateAge(p.getDob()));
		pr.setJob(fixJob(pr.getAge(), p.getSalary()));
		return null;
	}

	private static String fixJob(double age, double salary) {
		if (age < 18) {
			return "job1";
		} else if (age >= 18 && salary <= 10000) {
			return "job2";
		} else if (age >= 18 && salary > 10000) {
			return "job3";
		} else {
			return "Unknown"; // You can handle other cases as needed
		}
	}

	private static double calculateAge(Date dob) {
		LocalDate birthDate = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(birthDate, currentDate);
		double age = period.getYears() + (period.getMonths() / 12.0);
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.HALF_UP);
		return Double.parseDouble(df.format(age));
	}

}
