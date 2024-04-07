package com.jh1nz.backend.exception;

public class UserException extends BaseException{
    public UserException(String code) {
        super("user." + code);
    }

    //user.register.email.null
    public static UserException emailNull(){

        return new UserException("email is null");
    }

    //request.register.null
    public static UserException requestNull(){
        return new UserException("request is null");
    }
}
