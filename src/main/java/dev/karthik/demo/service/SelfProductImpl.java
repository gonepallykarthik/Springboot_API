package dev.karthik.demo.service;

import dev.karthik.demo.DTO.GenericProductDTO;
import dev.karthik.demo.models.Product;
import org.springframework.stereotype.Service;

@Service("selfProductImpl")
public class SelfProductImpl implements ProductService {
    @Override
    public GenericProductDTO getProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDTO createProduct(GenericProductDTO productDTO) {
        return null;
    }
}
