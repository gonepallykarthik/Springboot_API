package dev.karthik.demo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductDTO {
    private String title;
    private Long price;
    private String description;
    private String category;
    private String image;
}
