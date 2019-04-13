package com.coderx.shower.exception;

/**
 * <pre>
 *     author : YONGHAOZENG
 *     e-mail : 1007687534@qq.com
 *     time   : 2019/04/11
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class CustomException extends  RuntimeException {

        private String erroMsg;
        private String errCode;

    public String getErroMsg() {
        return erroMsg;
    }

    public CustomException setErroMsg(String erroMsg) {
        this.erroMsg = erroMsg;
        return this;
    }

    public String getErrCode() {
        return errCode;
    }

    public CustomException setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }

    public CustomException( String erroMsg, String errCode) {
        super(erroMsg);
        this.erroMsg = erroMsg;
        this.errCode = errCode;
    }
}
