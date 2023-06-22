package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.Categories;
import gmt.medical.service.CategoryService;


@Controller
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
<<<<<<< HEAD
	public String home() {
		return "home";
=======
	public String home(HttpSession session,Categories categories) {
		// 카테고리 목록 불러오기
		List<Categories> category = categoryService.getcategory();
		session.setAttribute("Category", category);
		return "Home";
>>>>>>> f837618 (카테고리 헤더부분과 카테고리 페이지 부분 카테고리 id키추가)
	}
	
	@RequestMapping(value = "/Order_list", method = RequestMethod.GET)
	public String Order_list() {
		return "Order_list";
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> refs/rewritten/master-7
	// Order_complete page
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
=======
	@RequestMapping(value = "/Shipping_address", method = RequestMethod.GET)
<<<<<<< HEAD
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
=======
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
>>>>>>> refs/rewritten/master-7
=======
>>>>>>> 073004f (InfoController 수정 2)
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete(@RequestParam("product_id") int productId,
								@RequestParam("product_name") String productName,
								@RequestParam("cart_option") String cartOption,
								@RequestParam("purchase_quantity") int purchaseQuantity,HttpSession session) {
		String hcode = (String) session.getAttribute("hcode");
		Integer user_id = (Integer) session.getAttribute("user_id");
		categoryService.addorderlist(productId,productName,cartOption,purchaseQuantity,hcode,user_id);
		return "Order_complete";
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> refs/rewritten/master-7
<<<<<<< HEAD
>>>>>>> 76d708c (HomeController /Order_complete add)
}

=======
}
<<<<<<< HEAD
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
=======
>>>>>>> a0d0c7b (홈컨트롤러 공백 충돌 처리)
=======
}
>>>>>>> refs/rewritten/juyoon-4
>>>>>>> refs/rewritten/master-6
<<<<<<< HEAD
=======
=======
>>>>>>> 073004f (InfoController 수정 2)
	@RequestMapping(value = "/Info_edit", method = RequestMethod.GET)
	public String Info_edit() {
		return "Info_edit";
	}
	
	@RequestMapping(value = "/Info_edit_Form", method = RequestMethod.GET)
	public String Info_edit_Form() {
		return "Info_edit_Form";
	}
<<<<<<< HEAD
}
>>>>>>> a787ce6 (회원정보 수정 페이지 완료)
=======
>>>>>>> refs/rewritten/master-7
>>>>>>> refs/rewritten/master-8
=======
=======
>>>>>>> efa7209 (회원정보 수정 완료)
	@RequestMapping(value = "/Categorie", method = RequestMethod.GET)
	public String Categorie() {
		return "Categorie";
	}
<<<<<<< HEAD
}
>>>>>>> 03e5ff1 (Categorie 페이지 완성)
=======
	
=======
>>>>>>> 8029d90 (카테고리 상품정보 갖고오기 (이미지아직 안됨))
	@RequestMapping(value = "/Checkout", method = RequestMethod.GET)
	public String Checkout() {
		return "Checkout";
	}
<<<<<<< HEAD
}
>>>>>>> 23f31a6 (체크아웃 페이지 완성)
=======
=======
>>>>>>> 4b96713 (제품 구매 확정 페이지 작업중)
	
<<<<<<< HEAD
	@RequestMapping(value = "/saveAddress", method = RequestMethod.GET)
	public String saveAddress(Shipping_address address) {
		addressService.saveAddress(address);
		System.out.println(address);
		return "redirect:/Shipping_address_List";
	}
	
	@Autowired
    private Shipping_address_Service addressService;
}
>>>>>>> 5078813 (배송지주소 데이터 mysql DB SAVE)
=======
}
>>>>>>> 6d136f8 (컨트롤러 수정)
