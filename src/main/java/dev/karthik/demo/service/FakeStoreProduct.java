package dev.karthik.demo.service;

import dev.karthik.demo.DTO.FakeStoreDTO;
import dev.karthik.demo.DTO.GenericProductDTO;
import dev.karthik.demo.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStoreProductService")
public class FakeStoreProduct implements ProductService{
    private RestTemplateBuilder restTemplateBuilder;
    private String requestUrl = "https://fakestoreapi.com/products/{id}";
    private String postRequestURl = "https://fakestoreapi.com/products";

    public FakeStoreProduct(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public GenericProductDTO getProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreDTO> response = restTemplate.getForEntity(requestUrl, FakeStoreDTO.class, id);

        FakeStoreDTO fakeStoreDTO = response.getBody();
        GenericProductDTO p = new GenericProductDTO();
        p.setImage(fakeStoreDTO.getImage());
        p.setTitle(fakeStoreDTO.getTitle());
        p.setPrice(fakeStoreDTO.getPrice());
        p.setDescription(fakeStoreDTO.getDescription());
        p.setCategory(fakeStoreDTO.getCategory());

        return p;
    }

    @Override
    public GenericProductDTO createProduct(GenericProductDTO productDTO) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<GenericProductDTO> response = restTemplate.postForEntity(postRequestURl, productDTO, GenericProductDTO.class);

        return response.getBody();
    }


}
