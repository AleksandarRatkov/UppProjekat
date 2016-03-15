package activiti.spring.javnaNabavka.springweb.services;

import java.util.List;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CommonsService")
public class CommonsService {

	
//	@Autowired
//	private TaskService taskService;
//
//	@Autowired
//	private FormService formService;
//	
//	@Autowired
//	private RepositoryService repositoryService;
//	
	@Autowired
	private RuntimeService runtimeService;

	
	public boolean proveraPlana()
	{
		//return false;
		System.out.println("Nabavka je u planu");
		return true;
	}
	
	public void posaljiPrijavu()
	{

		System.out.println("prijava je poslata");
		//Execution execution = runtimeService.createExecutionQuery().messageEventSubscriptionName("kvalifikacijaPrijava").singleResult();
		//System.out.println("execution id "+execution.getId());
		
		
		//runtimeService.createExecutionQuery().

		//System.out.println("signalObjavaPozivaZaPrijave "+executions.size());
		//System.out.println("startSignalZaSlanjePrijava "+executions1.size());
		//System.out.println("prijemPrijavaMessage "+executions2.size());
		List<Execution> executions4 = runtimeService.createExecutionQuery().list();
		for(Execution e:executions4){
			System.out.println("ukupno ispis "+e.getId());
		}
	//	runtimeService.messageEventReceived("kvalifikacijaPrijava", executions.get(0).getId());
		
		
	}
	
	public void prijemPrijava()
	{
		System.out.println("prijava je primljena");
	}
	
	public void tajmer(boolean istekaoTajmer)
	{
		System.out.println("istekao tajmer" +istekaoTajmer);
	}
	
	
	public void startProcesa2()
	{
		System.out.println("proces 2");
		/*ProcessDefinition procDef = repositoryService.createProcessDefinitionQuery().processDefinitionKey("PrijavljivanjeNaTender").latestVersion().singleResult();
		
		runtimeService.startProcessInstanceByKey("PrijavljivanjeNaTender");
		*/
		System.out.println("PrijavljivanjeNaTender");
		

	}
	
	public void baciSignal()
	{
		System.out.println("bacen signal");
	}
	

}
