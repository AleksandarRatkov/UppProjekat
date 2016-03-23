package activiti.spring.javnaNabavka.springweb.services;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("AktiviranjeProcesa")
public class AktiviranjeProcesa implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Uslo se u aktiviranje procesa!!!");
		
		String procesDefId = (String) execution.getVariable("procesDefId");
		
		RepositoryService repositoryService = execution.getEngineServices().getRepositoryService();
		 repositoryService.activateProcessDefinitionById(procesDefId);
	}

}

