package activiti.spring.javnaNabavka.springweb.services;

import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.identity.User;
import org.springframework.stereotype.Service;

@Service("PokupiPonudjace")
public class PokupiPonudjace implements TaskListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		
		DelegateExecution ex = delegateTask.getExecution();
		IdentityService identityService = ex.getEngineServices().getIdentityService();
		
		List<User> adekvatniPonudjaci = identityService.createUserQuery().memberOfGroup("ponudjac").list();
		ex.setVariable("adekvatniPonudjaci", adekvatniPonudjaci);
		
		System.out.println("odradio postavljanje i varijabla je " + adekvatniPonudjaci);

	}

}
