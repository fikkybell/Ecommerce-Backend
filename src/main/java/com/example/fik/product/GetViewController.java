//package com.example.fik.product;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.example.fik.product.ProductRepository;
//import com.example.fik.product.Product;
//
//@Controller
//public class GetViewController {
//    @Autowired
//    private ProductRepository productRepository;
//
//    @RequestMapping(value = "/addProduct",method = RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView returnAddProduct()
//    {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("addProduct");
//        //mv.addObject("var", "halim");
//        return mv;
//
//    }
//
//    @RequestMapping(value = "/listProduct",method = RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView returnListProduct()
//    {
//        ModelAndView mv = new ModelAndView();
//        List<Product> products = productRepository.findAll();
//        mv.setViewName("listProducts");
//        mv.addObject("products", products);
//        return mv;
//
//    }
//
//}
