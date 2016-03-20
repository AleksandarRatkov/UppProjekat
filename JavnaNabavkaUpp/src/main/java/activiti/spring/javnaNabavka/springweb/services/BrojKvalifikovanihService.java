package activiti.spring.javnaNabavka.springweb.services;

import java.util.ArrayList;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Service;

import activiti.spring.javnaNabavka.enitity.Prijava;

@Service("BrojKvalifikovanihService")
public class BrojKvalifikovanihService implements TaskListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	@SuppressWarnings("unchecked")
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub

		DelegateExecution execution = delegateTask.getExecution();
		ArrayList<Prijava> kvalifikovanePrijave = (ArrayList<Prijava>) execution.getVariable("kvalifikovanePrijave");

		ArrayList<String> kvalifikovaniZaPonude = (ArrayList<String>) execution.getVariable("kvalifikovaniZaPonude");

		String potvrdjenaKvalifikacija = (String) execution.getVariable("priznanjeKvalifikacije");
		Integer brojPotvrdjenihKvalifikacija = (Integer) execution.getVariable("brojPotvrdjenihKvalifikacija");

		if (brojPotvrdjenihKvalifikacija == null && kvalifikovanePrijave == null && kvalifikovaniZaPonude == null) {
			brojPotvrdjenihKvalifikacija = 0;
			kvalifikovanePrijave = new ArrayList<Prijava>();
			kvalifikovaniZaPonude = new ArrayList<String>();
		}
		if (potvrdjenaKvalifikacija != null) {
			if (potvrdjenaKvalifikacija.equals("true")) {
				brojPotvrdjenihKvalifikacija++;
				System.out.println("Varijabla prijava je: " +  execution.getVariable("prijava"));
				Prijava p = (Prijava) execution.getVariable("prijava");
				kvalifikovanePrijave.add(p);
				kvalifikovaniZaPonude.add(p.getUser());
			}
		}

		execution.setVariable("brojPotvrdjenihKvalifikacija", brojPotvrdjenihKvalifikacija);
		System.out.println("kvalifikovaniZaPonude su : " + kvalifikovaniZaPonude);
		execution.setVariable("kvalifikovaniZaPonude", kvalifikovaniZaPonude);
		execution.setVariable("kvalifikovanePrijave", kvalifikovanePrijave);
	}

}
