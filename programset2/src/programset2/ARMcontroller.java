package programset2;

public class ARMcontroller extends Controller{
	
	private String ControllerName;
	private String ControllerType;
	private String ControllerCore;
	
	ARMcontroller(){
		ControllerName = "tiva";
		ControllerType = "32_byte";
		ControllerCore = "Single";
	}
	
	ARMcontroller(String ContlName){
		super(ContlName);
		
	}
	
	ARMcontroller(String ContlType, String ContlCore){
		super(ContlType, ContlCore);
	}

}
