package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.JobTitleService;
import kodlama.hrms.dataaccess.abstracts.JobTitleDao;
import kodlama.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
	@Autowired
	JobTitleDao jobDao;

	@Override
	public List<JobTitle> getAll() {
		return  jobDao.findAll();
		
	}

}
