package net.go_sharp.db_web_rest.controller;

import net.go_sharp.db_web_rest.model.Person;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public @ResponseBody Person data() {

		Person p = new Person();
		p.setJob("java");
		p.setName("juan");
		p.setSize(27);

		return p;

	}

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Person getPet() {
		Person p = new Person();
		p.setJob("java");
		p.setName("juan");
		p.setSize(27);

		return p;
	}

}
