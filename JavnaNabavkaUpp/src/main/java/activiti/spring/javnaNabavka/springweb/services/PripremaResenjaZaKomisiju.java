package activiti.spring.javnaNabavka.springweb.services;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.activiti.engine.identity.User;
import org.springframework.stereotype.Service;

@Service("PripremaRjesenjaZaKomisiju")
public class PripremaResenjaZaKomisiju implements JavaDelegate {

	private IdentityService identityService;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		identityService = execution.getEngineServices().getIdentityService();

		User pravnik = identityService.createUserQuery().userId((String) execution.getVariable("pravnik"))
				.singleResult();
		List<User> stranaLica = identityService.createUserQuery().userId((String) execution.getVariable("stranaLica"))
				.list();
		List<User> sluzbenici = identityService.createUserQuery().userId((String) execution.getVariable("sluzbenici"))
				.list();
		List<String> clanoviKomisije = new ArrayList<String>();

		
		clanoviKomisije.add(pravnik.getId());
		execution.setVariable("clan1", pravnik.getFirstName() + " " + pravnik.getLastName());
		if (stranaLica != null && sluzbenici != null) {
			if ((stranaLica.size() + sluzbenici.size()) > 2) {
				// vratiti se na prethodni task, nije validno
			} else {
				for (User u : stranaLica) {
					clanoviKomisije.add(u.getId());
					execution.setVariable("clan2", u.getFirstName() + " " + u.getLastName());
				}

				for (User u : sluzbenici) {
					clanoviKomisije.add(u.getId());
					execution.setVariable("clan3", u.getFirstName() + " " + u.getLastName());
				}

				execution.setVariable("clanoviKomisije", clanoviKomisije);
				execution.setVariable("internetAdresaKonkursneDokumentacije", "www.konkurs.com");
			}
		}
		
			execution.setVariable("procesDefId", execution.getProcessDefinitionId());
	}
}
