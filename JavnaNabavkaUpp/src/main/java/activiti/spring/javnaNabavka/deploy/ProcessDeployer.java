package activiti.spring.javnaNabavka.deploy;
import java.util.Scanner;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;


/**
 * Klasa zaduzena za deployment
 * @author xyz
 *
 */
public class ProcessDeployer {

	private static final String procesJavneNabavke = "diagrams/JavnaNabavka.bpmn";
	private static final String slanjePrijave = "diagrams/SlanjePrijave.bpmn";
	private static final String slanjePonude = "diagrams/SlanjePonuda.bpmn";
	private static final String pregledZastitePrava = "diagrams/pregledZastitePrava.bpmn";
	private static final String zastitaPrava = "diagrams/zastitaPrava.bpmn";
	private static Scanner scanner;

	public static void main (String[] args){

		scanner = new Scanner(System.in);
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

		System.out.println("Deploy-ovati definiciju? [d/n]");
		Character reply = scanner.next().charAt(0);
		RepositoryService repositoryService = processEngine.getRepositoryService();
		if (reply == 'd'){
			System.out.println("Izbrisati prethodne deploymente? [d/n]");
			if (scanner.next().equalsIgnoreCase("d"))
				for (Deployment d : repositoryService.createDeploymentQuery().list()){
					
					repositoryService.deleteDeployment(d.getId(),true);
				}
		
		repositoryService.createDeployment().addClasspathResource(procesJavneNabavke).deploy();

		repositoryService.createDeployment().addClasspathResource(slanjePrijave).deploy();
		
		repositoryService.createDeployment().addClasspathResource(pregledZastitePrava).deploy();
		
		repositoryService.createDeployment().addClasspathResource(slanjePonude).deploy();
		
		repositoryService.createDeployment().addClasspathResource(zastitaPrava).deploy();
			System.out.println("Ukupan broj deployment-a: " + repositoryService.createDeploymentQuery().count());
		}
	}




}
