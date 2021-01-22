package com.atguigu.crowd.exception;/**
 * com.atguigu.crowd.exception
 * min
 * 2021/1/14
 * 21:41
 */

/**
 *@ClassName LoginFailedException
 *@Author min
 *@Date 2021/1/14 21:41
 *@Version 1.0
 */
public class LoginFailedException extends RuntimeException {
    private static final long serialVersionUID = -640863176866430993L;

    public LoginFailedException() {
    }

    public LoginFailedException(String message) {
        super(message);
    }

    public LoginFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginFailedException(Throwable cause) {
        super(cause);
    }

    public LoginFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
