package com.jh1nz.backend.exception;

public class ProductsException extends BaseException{

    public ProductsException(String code) {
        super("product" + code);
    }
    public static ProductsException notFound() {
        return new ProductsException("not found ");
    }
}
