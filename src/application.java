import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chathura.service.CustomerService;
import com.chathura.service.CustomerServiceImpl;


public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerService customerservice = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerservice =appContext.getBean("customerService", CustomerService.class);
				System.out.println(customerservice.findAll().get(0).getFirstName());

			
	}

}
