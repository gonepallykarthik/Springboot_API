package dev.karthik.demo.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreDTO {
    private Long id;
    private String title;
    private Long price;
    private String description;
    private String category;
    private String image;
}
