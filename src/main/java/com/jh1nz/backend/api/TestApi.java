package com.jh1nz.backend.api;

import com.jh1nz.backend.business.TestBusiness;
import com.jh1nz.backend.exception.BaseException;
import com.jh1nz.backend.model.RegisterRequest;
import com.jh1nz.backend.model.TestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("test")
public class TestApi {

    private final TestBusiness testBusiness;

    public TestApi(TestBusiness testBusiness) {
        this.testBusiness = testBusiness;
    }


    @GetMapping
    public TestResponse test() {

        TestResponse response = new TestResponse();
        response.setName("jh1Nz");
        response.setFood("Burger");
        return response;

    }


    @PostMapping
    @RequestMapping("register")
    public ResponseEntity<String>  register(@RequestBody RegisterRequest request) throws BaseException {


        String  response = testBusiness.register(request);
            return ResponseEntity.ok(response);


    }


}
