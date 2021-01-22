package com.atguigu.crowd.util;

import com.atguigu.crowd.constant.CrowdConstant;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @param 对传入的明文加密
 * @return 返回加密结果
 */
public class CrowdUtil {
    public static String md5(String source) {
        if (source == null || source.length() == 0) {
            throw new RuntimeException(CrowdConstant.MESSAGE_STRING_INVALIDATE);
        }

        try {
            //获取MessageDigest
            String algorithm = "md5";
            MessageDigest digest = MessageDigest.getInstance(algorithm);

            byte[] input = source.getBytes();
            byte[] output = digest.digest(input);
            Integer signum = 1;
            BigInteger bigInteger = new BigInteger(signum, output);
            // 按16进制给bigInteger加密
            return bigInteger.toString(16).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 判断当前请求是否为Ajax请求
     *
     * @param request 请求对象
     * @return true：当前请求是Ajax请求
     * false：当前请求不是Ajax请求
     */
    public static boolean judgeRequestType(HttpServletRequest request) {

        // 1.获取请求消息头
        String acceptHeader = request.getHeader("Accept");
        String xRequestHeader = request.getHeader("X-Requested-With");

        // 2.判断
        return (acceptHeader != null && acceptHeader.contains("application/json"))

                ||

                (xRequestHeader != null && xRequestHeader.equals("XMLHttpRequest"));
    }

}
