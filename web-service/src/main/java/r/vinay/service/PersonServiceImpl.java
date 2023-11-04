package r.vinay.service;

import javax.jws.WebService;

import r.vinay.business.BusinessEngine;
import r.vinay.model.Person;
import r.vinay.model.PersonResponse;

@WebService(endpointInterface = "r.vinay.service.PersonService")
public class PersonServiceImpl implements PersonService {

	@Override
	public PersonRs findMyJob(PersonRq request) {
		Person person = request.getPerson();
		PersonResponse response = BusinessEngine.processPersonRequest(person);
		PersonRs responseWrapper = new PersonRs();
		responseWrapper.setPersonResponse(response);
		return responseWrapper;
	}

}
