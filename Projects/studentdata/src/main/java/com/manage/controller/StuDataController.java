package com.manage.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manage.model.StuData;
import com.manage.repository.StuDataRepository;



@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")

public class StuDataController {
	
	@Autowired
	StuDataRepository studatarepository;
	
	@GetMapping("/StuData")
	public ResponseEntity<List<StuData>> getAllStuData(@RequestParam(required = false) String Name) {
		try {
			List<StuData> stuData = new ArrayList<StuData>();

			if (Name == null)
				studatarepository.findAll().forEach(stuData::add);
			else
				studatarepository.findByName(Name).forEach(stuData::add);

			if (stuData.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(stuData, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/StuData/{id}")
	public ResponseEntity<StuData> getStuDataById(@PathVariable("id") long id) {
		Optional<StuData> stuData = studatarepository.findById(id);

		if (stuData.isPresent()) {
			return new ResponseEntity<>(stuData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/StuData")
	public ResponseEntity<StuData> createStuData(@RequestBody StuData stuData) {
		try {
			StuData _stuData = studatarepository
					.save(new StuData(stuData.getName(),stuData.getCourse()));
			return new ResponseEntity<>(_stuData, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/StuData/{id}")
	public ResponseEntity<StuData> updateStuData(@PathVariable("id") long id, @RequestBody StuData stuData) {
		Optional<StuData> stuDatafile = studatarepository.findById(id);

		if (stuDatafile.isPresent()) {
			StuData _stuData = stuDatafile.get();
			_stuData.setName(stuData.getName());
			_stuData.setCourse(stuData.getCourse());
			
			return new ResponseEntity<>(studatarepository.save(_stuData), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
		

	@DeleteMapping("/StuData/{id}")
	public ResponseEntity<HttpStatus> deleteStuData(@PathVariable("id") long id) {
		try {
			studatarepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/StuData")
	public ResponseEntity<HttpStatus> deleteAllTutorials() {
		try {
			studatarepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/StuData/Course_name")
	public ResponseEntity<List<StuData>> findByCourse_name() {
		try {
			List<StuData> stuData = studatarepository.findByCourse(null);

			if (stuData.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(stuData, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
