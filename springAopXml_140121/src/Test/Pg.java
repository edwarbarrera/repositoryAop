package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.LoginDao;


public class Pg {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml" );
			MaDecoration monService = (MaDecoration) context.getBean("decore");

			LoginDao t = (LoginDao) context.getBean("leBeanLogin");
			/*t.daoAcess();
			t.daoCreation();
			t.methodMan();*/
			t.gitoMan();
			

			}
	}


