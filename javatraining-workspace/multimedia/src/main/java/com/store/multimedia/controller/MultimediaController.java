package com.store.multimedia.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.multimedia.model.Multimedia;
import com.store.multimedia.model.MultimediaType;

@RestController
public class MultimediaController {

	private static final Logger LOG = LoggerFactory.getLogger(MultimediaController.class);

	@GetMapping("/multimedia")
	public List<Multimedia> getAllMultimedia(@RequestParam(value = "type", required = false) MultimediaType type,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "from", required = false) String from,
			@RequestParam(value = "to", required = false) String to,
			@RequestParam(value = "sorted", required = false, defaultValue = "false") Boolean sorted) {

		// DUMMY IMPLEMENTATION
		// TODO make the actual implementation
		List<Multimedia> result = new ArrayList<Multimedia>();

		Multimedia m1 = new Multimedia();
		m1.setName("Something");
		m1.setAuthor("Someone");

		Multimedia m2 = new Multimedia();
		m2.setName("Something 2");
		m2.setAuthor("Someone 2");

		Multimedia m3 = new Multimedia();
		m3.setName("Something 3");
		m3.setAuthor("Someone 3");

		result.add(m1);
		result.add(m2);
		result.add(m3);

		LOG.info(String.format("Getting the following multimedia objects: %s", result));
		return result;
	}

	@GetMapping("/multimedia/count")
	public Integer countMultimedia(@RequestParam(value = "type", required = false) MultimediaType type) {
		// TODO implement the method
		return 0;
	}

}
