package gmt.medical.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/Product_details", method = RequestMethod.GET)
	public String Product_details() {
		return "Product_details";
	}
	
	@RequestMapping(value = "/Order_list", method = RequestMethod.GET)
	public String Order_list() {
		return "Order_list";
	}
	
<<<<<<< HEAD
	// Order_complete page
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
=======
	@RequestMapping(value = "/Shipping_address", method = RequestMethod.GET)
	public String Shipping_address() {
		return "Shipping_address";
	}
	
<<<<<<< HEAD
>>>>>>> refs/rewritten/master-branch-merge
=======
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
	
>>>>>>> 76d708c (HomeController /Order_complete add)
}

