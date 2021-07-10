package in.fuadhajiyev.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.fuadhajiyev.springboot.entity.Story;
import in.fuadhajiyev.springboot.repository.StoriesRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class StoriesController {
	
	@Autowired
	NotesRepository nRepo;
	@GetMapping("/stories")
	public ResponseEntity<List<Story>> readStories () {
		return new ResponseEntity<List<Story>>(nRepo.findAll(), HttpStatus.OK);
	}
}
















