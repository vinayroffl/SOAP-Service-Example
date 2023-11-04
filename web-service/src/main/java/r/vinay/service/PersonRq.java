package r.vinay.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import r.vinay.model.Person;

@XmlRootElement(name = "personRq", namespace = "http://vinay.r/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personRq", namespace = "http://vinay.r/")
public class PersonRq {

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
