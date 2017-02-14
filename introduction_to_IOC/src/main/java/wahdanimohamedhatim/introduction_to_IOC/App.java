package wahdanimohamedhatim.introduction_to_IOC;

/**
 * Hello world!
 *
 */
public class App implements IAPP {

	

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Class appReflectedClassFactory = null;
		String appFullClassName = "wahdanimohamedhatim.introduction_to_IOC.App";
		
		try {
			appReflectedClassFactory = Class.forName(appFullClassName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			IAPP appReflectedClass = (App) appReflectedClassFactory.newInstance();
			appReflectedClass.doSomeThing();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doSomeThing() {
		System.out.println("Someting done by App class");
	}

}
