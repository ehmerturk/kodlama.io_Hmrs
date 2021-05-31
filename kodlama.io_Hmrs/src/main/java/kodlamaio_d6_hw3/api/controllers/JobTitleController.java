package kodlamaio_d6_hw3.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio_d6_hw3.business.abstracts.JobTitleService;
import kodlamaio_d6_hw3.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/jobtitle")
public class JobTitleController {

	private JobTitleService jobTitleService;
	
	
	@Autowired    //IOC Yapilandirma
	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}



	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitleService.getAll();
	}
	
}
 