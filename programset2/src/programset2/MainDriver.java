package programset2;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller_name = new Controller();
		System.out.println(controller_name.getControllerN());
		ARMcontroller controllerSpecN = new ARMcontroller("tiva");
		/*The ARMcontroller now inherits the property of Controller and thus can use the method of controller.*/
		System.out.println(controllerSpecN.getControllerN());
		ARMcontroller controllerSpec = new ARMcontroller("32_byte", "single");
		System.out.println(controllerSpec.getControllerT());
		System.out.println(controllerSpec.getControllerC());
		
	}

}
