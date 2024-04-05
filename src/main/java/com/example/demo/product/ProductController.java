package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProductController {
    // "사용자(화면) 요청을 던지면" 그걸 받아서
    // 요청에 맞는 메소드를 실행 시킵니다.

    // 그 안에서, 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킬거에요.

    @Autowired
    private ProductService productService;

    // 상품 조회
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public String findProduct(@PathVariable("id") int id) {
//        ProductService productService = new ProductService();
        System.out.println(id);
        return productService.findProduct(id); // "NoteBook!";
    }

    // 상품 등록
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void saveProduct(@RequestParam(value="name") String productName) {
        // localhost:8080/products?name=________ => productName //productName에 담길거임
        System.out.println("POST");
        productService.saveProduct(productName);
    }
}
