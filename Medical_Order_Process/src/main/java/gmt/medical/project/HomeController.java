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
	public String Shipping_address() {
		return "Shipping_address";
=======
	@RequestMapping(value = "/Shipping_address_New", method = RequestMethod.GET)
	public String Shipping_address_New() {
		return "Shipping_address_New";
>>>>>>> f656784 (홈컨트롤러 충돌오류 수정)
	}
	
<<<<<<< HEAD
>>>>>>> refs/rewritten/master-branch-merge
=======
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76d708c (HomeController /Order_complete add)
}

=======
}
>>>>>>> 6b04680 (include footer, Product_add 생성)
=======
	@RequestMapping(value = "/Shipping_address_List", method = RequestMethod.GET)
	public String Shipping_address_List() {
		return "Shipping_address_List";
	}
	
	@RequestMapping(value = "/Shipping_address_Edit", method = RequestMethod.GET)
	public String Shipping_address_Edit() {
		return "Shipping_address_Edit";
	}
	
}
>>>>>>> f656784 (홈컨트롤러 충돌오류 수정)
