//package com.example.fik.product;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.Base64;
//import java.util.List;
//import java.util.Objects;
//
//@Service
//public class ProductService {
//    @Autowired
//    private ProductRepository productRepository;
//
//    public void  saveProductToDB(MultipartFile file, String name, String description
//            , int price)
//    {
//        Product p = new Product();
//        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
//        if(fileName.contains(".."))
//        {
//            System.out.println("not a a valid file");
//        }
//        try {
//            p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        p.setDescription(description);
//
//        p.setName(name);
//        p.setPrice(price);
//
//        productRepository.save(p);
//    }
//    public List<Product> getAllProduct()
//    {
//        return productRepository.findAll();
//    }
//    public void deleteProductById(Long id)
//    {
//        productRepository.deleteById(id);
//    }
//    public void chageProductName(Long id ,String name)
//    {
//        Product p = new Product();
//        p = productRepository.findById(id).get();
//        p.setName(name);
//        productRepository.save(p);
//    }
//    public void changeProductDescription(Long id , String description)
//    {
//        Product p = new Product();
//        p = productRepository.findById(id).get();
//        p.setDescription(description);
//        productRepository.save(p);
//    }
//    public void changeProductPrice(Long id,int price)
//    {
//        Product p = new Product();
//        p = productRepository.findById(id).get();
//        p.setPrice(price);
//        productRepository.save(p);
//    }
//}
