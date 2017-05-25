package mwsu.springframework.controllers;

import mwsu.springframework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bingyang.wei on 5/24/2017.
 */
@Controller
public class IndexController{

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String getIndex(Model model){
        model.addAttribute("products", productService.listProducts());
        return "index";
        //product service is first injected in to the controller by spring
        //bind a list of products to the attribute "products"
        //the model goes back through spring mvc dispatcher servlet which provide
        // the model to the template engine
    }
}
