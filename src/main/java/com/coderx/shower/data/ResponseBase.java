package com.coderx.shower.data;

import lombok.Data;

/**
 * <pre>
 *     author : YONGHAOZENG
 *     e-mail : 1007687534@qq.com
 *     time   : 2019/04/11
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@Data
public class ResponseBase<T> {
    private String status = "";
    private String msg = "";
    private T data;
    private String errorMsg = "";
    private String errCode = "1";
}
