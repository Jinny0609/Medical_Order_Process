package gmt.medical.model;

import java.util.List;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> refs/rewritten/hojun-6
=======
import org.springframework.web.multipart.MultipartFile;

>>>>>>> refs/rewritten/hojun-5
<<<<<<< HEAD
=======
import org.springframework.web.multipart.MultipartFile;

>>>>>>> refs/rewritten/Gyusun-3
=======
>>>>>>> refs/rewritten/hojun-6
public class Product_info {
	private int product_id;
    private String product_image;
    private String product_name;
    private int product_price;
    private int product_count;
    private String image_path;
    private int category_id;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> refs/rewritten/hojun-6
    private List<String> optionNames;
    
    @Override
	public String toString() {
	    return "Product_info : {" +
	            "product_id=" + product_id +
	            ", product_image='" + product_image + '\'' +
	            ", product_name='" + product_name + '\'' +
	            ", product_price=" + product_price +
	            ", product_count=" + product_count +
	            ", image_path='" + image_path + '\'' +
	            ", category_id=" + category_id +
	            ", optionNames=" + optionNames +
	            '}';
	}
    
=======
    private MultipartFile save_image;
    private List<String> optionNames;
<<<<<<< HEAD
    private String cart_option;
    
<<<<<<< HEAD
>>>>>>> refs/rewritten/hojun-5
=======
    private MultipartFile save_image;
    private List<String> optionNames;
    
>>>>>>> refs/rewritten/Gyusun-3
=======
	public String getCart_option() {
		return cart_option;
	}
	public void setCart_option(String cart_option) {
		this.cart_option = cart_option;
	}
>>>>>>> 4112a66 (프로덕트 인포 모델 수정)
=======
    
>>>>>>> refs/rewritten/hojun-5
>>>>>>> refs/rewritten/hojun-6
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> refs/rewritten/Gyusun-3
=======
=======
>>>>>>> refs/rewritten/hojun-6
	public MultipartFile getSave_image() {
		return save_image;
	}
	public void setSave_image(MultipartFile save_image) {
		this.save_image = save_image;
	}
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> refs/rewritten/hojun-5
=======
>>>>>>> refs/rewritten/Gyusun-3
=======
>>>>>>> refs/rewritten/hojun-5
>>>>>>> refs/rewritten/hojun-6
	public List<String> getOptionNames() {
		return optionNames;
	}
	public void setOptionNames(List<String> optionNames) {
		this.optionNames = optionNames;
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> refs/rewritten/Gyusun-3
=======
=======
>>>>>>> refs/rewritten/hojun-6
	   
    @Override
    public String toString() {
        return "{" +
                "product_id=" + product_id +
                ", product_image='" + product_image + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_count=" + product_count +
                ", image_path='" + image_path + '\'' +
                ", category_id=" + category_id +
                ", save_image='" + (save_image != null ? save_image.getOriginalFilename() : "null") + '\'' +
                ", optionNames=" + optionNames +
                '}';
    }
	
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> refs/rewritten/hojun-5
=======
>>>>>>> refs/rewritten/Gyusun-3
=======
>>>>>>> refs/rewritten/hojun-5
>>>>>>> refs/rewritten/hojun-6
}
