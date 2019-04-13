package com.coderx.shower.exception;

import com.coderx.shower.data.ResponseBase;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * <pre>
 *     author : YONGHAOZENG
 *     e-mail : 1007687534@qq.com
 *     time   : 2019/04/11
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ResponseBase handleCustomExp(CustomException ex){
        ResponseBase<Object> responseBase = new ResponseBase<>();
        responseBase.setErrorMsg(ex.getErroMsg());
        responseBase.setStatus(ex.getErrCode());
        responseBase.setErrCode("1");
        return responseBase;
    }



    @ExceptionHandler(Exception.class)
    @ResponseBody
    public void handleAllExp(HttpServletRequest request,Exception ex){

    }


}
