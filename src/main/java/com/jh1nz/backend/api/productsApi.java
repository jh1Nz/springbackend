package com.jh1nz.backend.api;

import com.jh1nz.backend.business.productsBusiness;
import com.jh1nz.backend.exception.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class productsApi {

    private final productsBusiness business;

    public productsApi(productsBusiness business) {
        this.business = business;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getProduct(@PathVariable String id) throws BaseException {
       String response = business.getProductsById(id);
        return ResponseEntity.ok(response);
    }
}
