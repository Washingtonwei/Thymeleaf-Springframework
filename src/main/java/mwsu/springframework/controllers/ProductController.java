package mwsu.springframework.controllers;

import mwsu.springframework.domain.Product;
import mwsu.springframework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bingyang.wei on 5/24/2017.
 */
@Controller
public class ProductController {

    private ProductService productService;
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product")
    public String getProduct(){
        return "redirect:/index";
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model){//String mvc is parsing
        // the id value,
        // conver it to integer
        //ask mvc for the model, mvc will see the model based on reflection,
        // model gets injected into the method
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);//bind the product that has been
        // asked for to attribute value on the model,
        // this model will be returned to Thymeleaf engine, we have access to that product
        return "product";
    }
}
