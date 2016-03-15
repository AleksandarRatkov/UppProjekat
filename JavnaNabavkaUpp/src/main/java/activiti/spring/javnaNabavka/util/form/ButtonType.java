package activiti.spring.javnaNabavka.util.form;
import org.activiti.engine.form.AbstractFormType;

public class ButtonType extends AbstractFormType{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9030643730202053004L;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "button";
	}

	@Override
	public Object convertFormValueToModelValue(String arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public String convertModelValueToFormValue(Object arg0) {
		// TODO Auto-generated method stub
		if (arg0 == null) {
			return null;
		}
		return arg0.toString();
	}

}
