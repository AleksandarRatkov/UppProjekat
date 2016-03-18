package activiti.spring.javnaNabavka.springweb.services;

import java.util.ArrayList;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Service;

import activiti.spring.javnaNabavka.enitity.Prijava;

@Service("BrojKvalifikovanihService")
public class BrojKvalifikovanihService implements TaskListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		
		DelegateExecution execution=delegateTask.getExecution();
		@SuppressWarnings("unchecked")
		ArrayList<Prijava> kvalifikovanePrijave = (ArrayList<Prijava>) execution.getVariable("kvalifikovanePrijave");

		String potvrdjenaKvalifikacija = (String) execution.getVariable("priznanjeKvalifikacije");
		Integer brojPotvrdjenihKvalifikacija = (Integer) execution.getVariable("brojPotvrdjenihKvalifikacija");
		
		if ( brojPotvrdjenihKvalifikacija == null && kvalifikovanePrijave == null){
			brojPotvrdjenihKvalifikacija = 0;
			kvalifikovanePrijave = new ArrayList<Prijava>();
		}
		
		if(potvrdjenaKvalifikacija.equals("true"))
		{
			brojPotvrdjenihKvalifikacija++;
			kvalifikovanePrijave.add((Prijava) execution.getVariable("prijava"));
		}
		
		execution.setVariable("brojPotvrdjenihKvalifikacija", brojPotvrdjenihKvalifikacija);
		execution.setVariable("kvalifikovanePrijave", kvalifikovanePrijave);
	}

}
