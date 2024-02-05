package in.Naveenit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	@GetMapping("/")
	 public Customer getCustomer() {
		
		 Customer  c = new Customer();
		 c.setId(1);
		 c.setName("Naveen");
		 c.setEmail("Naveen@123");
		c.setPhno(97059209);
		  
		 
		 
		  return c;
		 
	 }
	

}
