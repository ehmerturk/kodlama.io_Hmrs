package kodlamaio_d6_hw3.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio_d6_hw3.business.abstracts.JobTitleService;
import kodlamaio_d6_hw3.dataAccess.abstracts.JobTitleDao;
import kodlamaio_d6_hw3.entities.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	
	

	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

	
	
	
}
