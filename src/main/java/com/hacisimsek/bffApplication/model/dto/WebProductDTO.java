package com.hacisimsek.bffApplication.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WebProductDTO {
    private Long id;
    private String name;
    private Double price;
}
