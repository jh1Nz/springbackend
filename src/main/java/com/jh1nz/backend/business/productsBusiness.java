package com.jh1nz.backend.business;

import com.jh1nz.backend.exception.BaseException;
import com.jh1nz.backend.exception.ProductsException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class productsBusiness {
    public String getProductsById(String id) throws BaseException {
        if(!Objects.equals("1234",id)){
            throw ProductsException.notFound();
        }
        return id;
    }
}
