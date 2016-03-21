package activiti.spring.javnaNabavka.springweb.services;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("BaciPorukuService")
public class BaciPorukuService implements JavaDelegate{

	private RuntimeService runtimeService;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Usao u bacanje poruka");
		runtimeService = execution.getEngineServices().getRuntimeService();
		
		String nazivNarucioca = (String) execution.getVariable("nazivNarucioca");
		String adresaNarucioca = (String) execution.getVariable("adresaNarucioca");
		Double procenjenaVrednost = (Double) execution.getVariable("procenjenaVrednost");
		String internetStranicaNarucioca = (String) execution.getVariable("internetStranicaNarucioca");
		String opisPredmetaNabavke = (String) execution.getVariable("opisPredmetaNabavke");
		
		Map<String,Object> mapaVarijabli = new HashMap<String, Object>();
		mapaVarijabli.put("nazivNarucioca", nazivNarucioca);
		mapaVarijabli.put("adresaNarucioca", adresaNarucioca);
		mapaVarijabli.put("procenjenaVrednost", procenjenaVrednost);
		mapaVarijabli.put("internetStranicaNarucioca", internetStranicaNarucioca);
		mapaVarijabli.put("opisPredmetaNabavke", opisPredmetaNabavke);
		
		runtimeService.startProcessInstanceByMessage("porukaZaPonudu",mapaVarijabli);
	}

}
