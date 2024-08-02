package dev.karthik.demo.service;

import dev.karthik.demo.DTO.GenericProductDTO;
import dev.karthik.demo.models.Product;

public interface ProductService {
    public GenericProductDTO getProductById(Long id);
    public GenericProductDTO createProduct(GenericProductDTO productDTO);
}
