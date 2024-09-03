package com.hacisimsek.bffApplication.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MobileProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Double rating;
}
