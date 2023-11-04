package r.vinay.business;

import r.vinay.model.Person;
import r.vinay.model.PersonResponse;

public class BusinessEngine {

	public static PersonResponse processPersonRequest(Person p) {
		PersonResponse pr = BusinessService.processLogic(p);
		return pr;

	}

}
