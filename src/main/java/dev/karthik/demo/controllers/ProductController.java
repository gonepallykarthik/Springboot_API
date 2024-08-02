package dev.karthik.demo.controllers;

import dev.karthik.demo.DTO.GenericProductDTO;
import dev.karthik.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public void getAllProducts(){

    }

    @GetMapping("/products/{id}")
    public GenericProductDTO getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(){

    }

    @PutMapping("/products/{id}")
    public void updateProductById(){

    }

    @PostMapping("/products")
    public GenericProductDTO createProduct(@RequestBody GenericProductDTO genericProductDTO){
        return productService.createProduct(genericProductDTO);
    }

}
