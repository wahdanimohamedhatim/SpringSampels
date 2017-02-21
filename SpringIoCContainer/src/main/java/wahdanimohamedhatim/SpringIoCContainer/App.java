package wahdanimohamedhatim.SpringIoCContainer;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		// Chargement de context d'application à partir du file systeme
		System.out.println("SpringContextXmlConfigFileOutOfClassPath Loading!");
//		ApplicationContext contextFileSystem = new FileSystemXmlApplicationContext(
//				"file:C:/GIT/SpringSampels/SpringIoCContainer/SpringContextXmlConfigFileOutOfClassPath.xml");
		System.out.println("SpringContextXmlConfigFileInClassPath Loading!");
		
		// Chargement de context d'application à partir du ClassPath
		ApplicationContext contextClassPath = new ClassPathXmlApplicationContext(
				"SpringContextXmlConfigFileInClassPath.xml");

		IPersonne personne = (IPersonne) contextClassPath.getBean("aBean1");

		personne.sayHello();

		// le bean et les valeurs de ses proprieetées sont chargé une fois lors
		// du chargement du context Spring
		// pour chaque Bean Spring Par defaut cree un Singleton de la class  correspondante !!! 
		// vous pouvez essayer de changer les valeurs à chaux, vous remarquerez
		// que les valeurs affichiées ne changent pas
//		System.out.println("Ouverture du listner");
//		int keyCode = 0;
//		while (keyCode != 32) {
//			keyCode = System.in.read();
//			System.out.println(keyCode);
//			personne.sayHello();
//		}
//		System.out.println("Arret du listner");
//		ApplicationContext contextClassPath2 = new ClassPathXmlApplicationContext(
//				"SpringContextXmlConfigFileInClassPath.xml");
//		IPersonne personne2 = (IPersonne) contextClassPath2.getBean("aBean");
//		personne.sayHello();
//		personne2.sayHello();
//
//		personne.changeMyFName(" personne Hatim");
//
//		personne.sayHello();
//		personne2.sayHello();
//
//		personne2.changeMyFName(" personne2 Mohamed");
//
//		personne.sayHello();
//		personne2.sayHello();
		
		

	}
}
