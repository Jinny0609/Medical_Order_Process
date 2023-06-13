package gmt.medical.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.Shipping_address;
import gmt.medical.service.Shipping_address_Service;

@Controller
public class InfoController {

	@Autowired
	private Shipping_address_Service addressService;

	// 배송지주소 DB에 저장
	@RequestMapping(value = "/saveAddress", method = RequestMethod.GET)
	public String saveAddress(Shipping_address address) {
		addressService.saveAddress(address);
		return "redirect:/Shipping_address_List";
	}

	// 배송지 정보 작성 페이지 이동
	@RequestMapping(value = "/Shipping_address_New", method = RequestMethod.GET)
	public String Shipping_address_New() {
		return "Shipping_address_New";
	}

	// 배송지 리스트 페이지 이동
	@RequestMapping(value = "/Shipping_address_List", method = RequestMethod.GET)
	public String Shipping_address_List(Model model) {
		List<Shipping_address> addresses = addressService.getAllAddresses();
		model.addAttribute("addresses", addresses);
		return "Shipping_address_List";
	}

	// 배송지 수정 페이지 이동
	@RequestMapping(value = "/Shipping_address_Edit", method = RequestMethod.GET)
	public String Shipping_address_Edit(@RequestParam("key") int address_id, Model model) {
		Shipping_address address = addressService.getAddressById(address_id);
		model.addAttribute("address", address);
		return "Shipping_address_Edit";
	}

	// 배송지 수정 처리
	@RequestMapping(value = "/updateAddress", method = RequestMethod.POST)
	public String updateAddress(Shipping_address address) {
		addressService.updateAddress(address);
		return "redirect:/Shipping_address_List";
	}

	// 배송지 삭제 처리
	@RequestMapping(value = "/deleteAddress", method = RequestMethod.POST)
	public String deleteAddress(int address_id) {
		addressService.deleteAddress(address_id);
		return "redirect:/Shipping_address_List";
	}
}
