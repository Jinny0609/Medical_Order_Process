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
<<<<<<< HEAD
	public String Shipping_address_New() {
=======
>>>>>>> 0c76e9e (충돌일어나기전 미리 수정)
=======
	@RequestMapping(value = "/Shipping_address_New", method = RequestMethod.GET)
>>>>>>> refs/rewritten/juyoon-4
	public String Shipping_address() {
>>>>>>> refs/rewritten/master-6
		return "Shipping_address_New";
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> refs/rewritten/master-branch-merge
=======
=======
>>>>>>> refs/rewritten/juyoon-4
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
	
<<<<<<< HEAD
	@RequestMapping(value = "/Shipping_address_List", method = RequestMethod.GET)
	public String Shipping_address_List() {
		return "Shipping_address_List";
	}
	
	@RequestMapping(value = "/Shipping_address_Edit", method = RequestMethod.GET)
	public String Shipping_address_Edit() {
		return "Shipping_address_Edit";
	}
	
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76d708c (HomeController /Order_complete add)
}

=======
}
>>>>>>> a0d0c7b (홈컨트롤러 공백 충돌 처리)
=======
}
>>>>>>> refs/rewritten/juyoon-4
>>>>>>> refs/rewritten/master-6
=======
	@RequestMapping(value = "/Info_edit", method = RequestMethod.GET)
	public String Info_edit() {
		return "Info_edit";
	}
	
	@RequestMapping(value = "/Info_edit_Form", method = RequestMethod.GET)
	public String Info_edit_Form() {
		return "Info_edit_Form";
	}
}
>>>>>>> a787ce6 (회원정보 수정 페이지 완료)
