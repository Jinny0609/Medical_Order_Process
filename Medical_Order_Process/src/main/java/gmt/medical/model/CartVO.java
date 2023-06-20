package gmt.medical.model;

public class CartVO {
	
	public class Cart {
	    private int product_id;
	    private String product_image;//상품 이미지
	    private String product_name;// 상품 이름
	    private int product_price; //상품 가격
	    private int product_count; //옵션 수량
	    private String cart_option;//옵션
	    private int user_id;		//유저 ID
	    
	    // Getters and Setters
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
	    
	    public String getCart_option() {
	        return cart_option;
	    }
	    
	    public void setCart_option(String cart_option) {
	        this.cart_option = cart_option;
	    }
	    
	    public int getUser_id() {
	        return user_id;
	    }
	    
	    public void setUser_id(int user_id) {
	        this.user_id = user_id;
	    }

	    
	}

}