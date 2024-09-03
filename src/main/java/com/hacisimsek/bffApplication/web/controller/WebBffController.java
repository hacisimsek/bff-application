package com.hacisimsek.bffApplication.web.controller;

import com.hacisimsek.bffApplication.model.dto.WebProductDTO;
import com.hacisimsek.bffApplication.model.dto.WebProductDetailDTO;
import com.hacisimsek.bffApplication.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/web")
public class WebBffController {

    private final ProductService productService;

    public WebBffController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<WebProductDTO> getProducts() {
        return productService.getAllProductsForWeb();
    }

    @GetMapping("/products/{id}")
    public WebProductDetailDTO getProductDetail(@PathVariable Long id) {
        return productService.getProductDetailForWeb(id);
    }
}
