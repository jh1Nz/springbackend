package com.jh1nz.backend.business;

import com.jh1nz.backend.exception.BaseException;
import com.jh1nz.backend.exception.UserException;
import com.jh1nz.backend.model.RegisterRequest;
import org.springframework.stereotype.Service;


import java.util.Objects;

@Service
public class TestBusiness {

    public String register(RegisterRequest request) throws BaseException {
        if(request == null){
            throw UserException.requestNull();

         }
    //Val email
        if(Objects.isNull(request.getEmail())) {
            throw UserException.emailNull();
        }

    return "";
    }
}
