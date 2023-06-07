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
<<<<<<< HEAD
	// Order_complete page
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
=======
	@RequestMapping(value = "/Shipping_address", method = RequestMethod.GET)
=======
	@RequestMapping(value = "/Shipping_address_New", method = RequestMethod.GET)
>>>>>>> 0c76e9e (충돌일어나기전 미리 수정)
	public String Shipping_address() {
		return "Shipping_address_New";
	}
	
<<<<<<< HEAD
>>>>>>> refs/rewritten/master-branch-merge
=======
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
	
<<<<<<< HEAD
>>>>>>> 76d708c (HomeController /Order_complete add)
}

=======
}
>>>>>>> a0d0c7b (홈컨트롤러 공백 충돌 처리)
