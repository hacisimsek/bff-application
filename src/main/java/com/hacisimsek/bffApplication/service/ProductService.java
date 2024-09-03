package com.hacisimsek.bffApplication.service;

import com.hacisimsek.bffApplication.model.dto.MobileProductDTO;
import com.hacisimsek.bffApplication.model.dto.MobileProductDetailDTO;
import com.hacisimsek.bffApplication.model.Product;
import com.hacisimsek.bffApplication.model.dto.WebProductDTO;
import com.hacisimsek.bffApplication.model.dto.WebProductDetailDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private List<Product> products = List.of(
            new Product(1L, "Laptop", 1200.0, "High-performance laptop", 4.5),
            new Product(2L, "Smartphone", 800.0, "Latest model smartphone", 4.2)
    );

    public List<WebProductDTO> getAllProductsForWeb() {
        return products.stream()
                .map(p -> new WebProductDTO(p.getId(), p.getName(), p.getPrice()))
                .collect(Collectors.toList());
    }

    public List<MobileProductDTO> getAllProductsForMobile() {
        return products.stream()
                .map(p -> new MobileProductDTO(p.getId(), p.getName(), p.getPrice(), p.getRating()))
                .collect(Collectors.toList());
    }

    public WebProductDetailDTO getProductDetailForWeb(Long id) {
        Product product = findProductById(id);
        return new WebProductDetailDTO(product.getId(), product.getName(), product.getPrice(), product.getDescription());
    }

    public MobileProductDetailDTO getProductDetailForMobile(Long id) {
        Product product = findProductById(id);
        return new MobileProductDetailDTO(product.getId(), product.getName(), product.getPrice(), product.getDescription(), product.getRating());
    }

    private Product findProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
