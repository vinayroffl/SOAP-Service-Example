package r.vinay.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import r.vinay.model.PersonResponse;

@XmlRootElement(name = "personRs", namespace = "http://vinay.r/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personRs", namespace = "http://vinay.r/")
public class PersonRs {
	private PersonResponse personResponse;

	public PersonResponse getPersonResponse() {
		return personResponse;
	}

	public void setPersonResponse(PersonResponse personResponse) {
		this.personResponse = personResponse;
	}

}
