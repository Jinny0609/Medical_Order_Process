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

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String Product_details() {
		return "Product_details";
	}
	
	@RequestMapping(value = "/User_info", method = RequestMethod.GET)
	public String User_info() {
		return "User_info";
	}
	
	// �ֹ� �Ϸ�� ��Ÿ���� ������
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
}

