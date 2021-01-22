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

    public class AdminAddOrUpdateException extends RuntimeException {
        private static final long serialVersionUID = -64084316430993L;

        public AdminAddOrUpdateException() {
        }

        public AdminAddOrUpdateException(String message) {
            super(message);
        }

        public AdminAddOrUpdateException(String message, Throwable cause) {
            super(message, cause);
        }

        public AdminAddOrUpdateException(Throwable cause) {
            super(cause);
        }

        public AdminAddOrUpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }