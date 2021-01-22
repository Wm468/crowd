package com.atguigu.crowd.exception;/**
 * com.atguigu.crowd.exception
 * min
 * 2021/1/16
 * 21:38
 */

/**
 *@ClassName AccessForbiddenException
 *@Author min
 *@Date 2021/1/16 21:38
 *@Version 1.0
 */
public class AccessForbiddenException extends RuntimeException   {


    private static final long serialVersionUID = 5990082417603244478L;

    public AccessForbiddenException() {
        super();
    }

    public AccessForbiddenException(String message) {
        super(message);
    }

    public AccessForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessForbiddenException(Throwable cause) {
        super(cause);
    }

    protected AccessForbiddenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
