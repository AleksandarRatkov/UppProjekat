package activiti.spring.javnaNabavka.util.form;

import org.activiti.engine.ActivitiIllegalArgumentException;
import org.activiti.engine.ActivitiObjectNotFoundException;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.form.AbstractFormType;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.repository.ProcessDefinition;

public class CustomForm extends AbstractFormType {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object convertFormValueToModelValue(String propertyValue) {
		// TODO Auto-generated method stub
		if (propertyValue != null) {
			ProcessDefinition processDefinition = ProcessEngines
					.getDefaultProcessEngine().getRepositoryService()
					.createProcessDefinitionQuery()
					.processDefinitionId(propertyValue).singleResult();

			if (processDefinition == null) {
				throw new ActivitiObjectNotFoundException(
						"Process definition with id " + propertyValue
								+ " does not exist",
						ProcessDefinitionEntity.class);
			}

			return processDefinition;
		}

		return null;
	}

	@Override
	public String convertModelValueToFormValue(Object modelValue) {
		if (modelValue == null) {
			return null;
		}

		if (!(modelValue instanceof ProcessDefinition)) {
			throw new ActivitiIllegalArgumentException(
					"This form type only support process definitions, but is "
							+ modelValue.getClass());
		}
		return ((ProcessDefinition) modelValue).getId();

	}

}
