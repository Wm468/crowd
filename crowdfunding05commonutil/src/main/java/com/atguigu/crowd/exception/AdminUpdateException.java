package com.atguigu.crowd.exception;/**
 * com.atguigu.crowd.exception
 * min
 * 2021/1/18
 * 12:14
 */

/**
 *@ClassName AdminAddOrUpdateException
 *@Author min
 *@Date 2021/1/18 12:14
 *@Version 1.0
 */

    public class AdminUpdateException extends RuntimeException {
        private static final long serialVersionUID = -6408431640993L;

        public AdminUpdateException() {
        }

        public AdminUpdateException(String message) {
            super(message);
        }

        public AdminUpdateException(String message, Throwable cause) {
            super(message, cause);
        }

        public AdminUpdateException(Throwable cause) {
            super(cause);
        }

        public AdminUpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }