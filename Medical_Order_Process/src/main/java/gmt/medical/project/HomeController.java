package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.Categories;
import gmt.medical.model.OrderCompleteInfo;
import gmt.medical.model.OrderVO;
import gmt.medical.service.CategoryService;
import gmt.medical.service.OrderCompleteService;
import gmt.medical.service.Shipping_address_Service;


@Controller
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private Shipping_address_Service shipping_address_service;
	
	@Autowired
	private OrderCompleteService orderCompleteService;
	
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
	public String Order_list(HttpSession session,Model model) {
		Integer user_id = (Integer) session.getAttribute("user_id");
		// 회원이 주문한 상품 정보 가져오기
		List<OrderVO> orderitem = shipping_address_service.getitemlist(user_id);
		    for (OrderVO order : orderitem) {
		        int productId = order.getProduct_id();
		        List<OrderVO> imglist = shipping_address_service.getimglist(productId);
		        order.setImglist(imglist); // OrderVO 객체에 imglist 저장
		    }
		model.addAttribute("Orderitem", orderitem);
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
	public String Order_complete(@RequestParam("product_id") List<Integer> productIds,
	                             @RequestParam("product_name") List<String> productNames,
	                             @RequestParam("cart_option") List<String> cartOptions,
	                             @RequestParam("product_count") List<Integer> product_counts,
	                             @RequestParam("product_price") List<Integer> productPrices,
	                             HttpSession session,
	                             Model model) { // Model 객체를 파라미터로 추가
	    String hcode = (String) session.getAttribute("hcode");
	    Integer user_id = (Integer) session.getAttribute("user_id");
	    
	    // 리스트의 크기와 인덱스 범위 검사
	    if (productIds.size() != productNames.size() || productIds.size() != cartOptions.size()
	            || productIds.size() != product_counts.size() || productIds.size() != productPrices.size()) {
	        // 오류 처리 로직 또는 예외 처리
	        // ...
	        return "error"; // 예시로 오류 페이지를 리턴하도록 설정
	    }
	    
	    // 리스트의 길이를 기준으로 반복하면서 값을 추출하여 로직 처리
	    for (int i = 0; i < productIds.size(); i++) {
	        int productId = productIds.get(i);
	        String productName = productNames.get(i);
	        String cartOption = cartOptions.get(i);
	        int product_count = product_counts.get(i);
	        int productPrice = productPrices.get(i);
	        
	        // 로직 처리
	        categoryService.addorderlist(productId, productName, cartOption, product_count, hcode, user_id,productPrice);
	        categoryService.updatecount(productId,product_count);
	    }
	    
	    // 주문 정보를 가져온 후 모델에 추가
	    OrderCompleteInfo orderCompleteInfo = orderCompleteService.getOrderCompleteInfo(user_id);
	    if(orderCompleteInfo == null) {
	        return "error"; 
	    }
	    model.addAttribute("orderCompleteInfo", orderCompleteInfo);
	    model.addAttribute("productPrice", orderCompleteInfo.getProductPrice() + 2500); // 개별 제품 가격을 모델에 추가

	    // 총 결제 금액을 가져와 모델에 추가
	    int totalPrice = orderCompleteService.getTotalPrice(user_id);
	    model.addAttribute("totalPriceWithoutDelivery", totalPrice); // 배송비를 제외한 가격
	    model.addAttribute("totalPrice", totalPrice + 2500); // 배송비 포함한 가격
	    
	    return "Order_complete";
	}
<<<<<<< HEAD
<<<<<<< HEAD
	
<<<<<<< HEAD
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
=======
}
>>>>>>> d8a36ca (주문완료테이블에 데이터 저장)
=======
}
>>>>>>> 34b370d (주문완료 완성)
=======
	
	@RequestMapping(value = "/admin_page", method = RequestMethod.GET)
	public String admin() {
		// 관리자페이지 이동
		return "admin_page";
	}
}
>>>>>>> caabeec (관리자 페이지 이동기능 추가)
