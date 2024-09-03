package com.hacisimsek.bffApplication.mobile.controller;

import com.hacisimsek.bffApplication.model.dto.MobileProductDTO;
import com.hacisimsek.bffApplication.model.dto.MobileProductDetailDTO;
import com.hacisimsek.bffApplication.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mobile")
public class MobileBffController {

    private final ProductService productService;

    public MobileBffController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<MobileProductDTO> getProducts() {
        return productService.getAllProductsForMobile();
    }

    @GetMapping("/products/{id}")
    public MobileProductDetailDTO getProductDetail(@PathVariable Long id) {
        return productService.getProductDetailForMobile(id);
    }
}
