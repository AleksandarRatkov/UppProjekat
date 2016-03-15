package activiti.spring.javnaNabavka.springweb.services;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Service;

@Service("EvidencijaClanovaKomisijeServis")
public class SastavljanjeClanovaKomisijeServis implements TaskListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 819452622113702617L;

	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		DelegateExecution execution=delegateTask.getExecution();

		String potvrdjenoClanstvo = (String) execution.getVariable("potvrdaClanstvaKomisije");
		Integer brojPotvrdjenihClanova = (Integer) execution.getVariable("brojPotvrdjenihClanova");
		if ( brojPotvrdjenihClanova == null){
			brojPotvrdjenihClanova = 0;
		}
		
		if(potvrdjenoClanstvo.equals("true"))
		{
			brojPotvrdjenihClanova++;
			System.out.println("**++");
		}
		
		execution.setVariable("brojPotvrdjenihClanova", brojPotvrdjenihClanova);
		System.out.println("zakacen broj "+brojPotvrdjenihClanova+" na proces "+execution.getProcessInstanceId());
		System.out.println("broj Potvrdjenih "+brojPotvrdjenihClanova+" id procesa "+execution.getProcessInstanceId());
		System.out.println("komisija je : " + execution.getVariable("komisija"));
	}
	
}
