package r.vinay.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface PersonService {
	@WebMethod(operationName = "executeFindMyJob")
	public PersonRs findMyJob(PersonRq request);

}