package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.JobTitleService;
import kodlama.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitleController {
	@Autowired
	JobTitleService jobService;
	
	@RequestMapping("/getAll")
	public List<JobTitle> getAll(){
		
		return jobService.getAll();
	}
}
