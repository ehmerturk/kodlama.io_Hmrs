package kodlamaio_d6_hw3.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio_d6_hw3.entities.concretes.JobTitle;


public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{

	
}
