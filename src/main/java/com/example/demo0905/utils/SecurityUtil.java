package com.example.demo0905.utils;

import cn.hutool.core.codec.Base64Decoder;
import cn.hutool.core.codec.Base64Encoder;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import com.example.demo0905.module.Entity.UserEntity;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import sun.security.util.Password;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class SecurityUtil {
    private static final String SALT="1234567812345678";

    public static String getUserId(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Long uid = (Long) request.getAttribute("uid");
        String token = request.getHeader("Authorization");
        JWT jwt = JWTUtil.parseToken(token);
        String userId = jwt.getPayload().getClaimsJson().getStr("userId");

        return userId;
    }

    public static UserEntity getUser(){
        return new UserEntity();
    }

    public static void printToken(){

    }

    /**
     *  文本 ==》加密 ==》 密文
     * 生成BCryptPasswordEncoder密码
     *
     * @param password 密码
     * @return 加密字符串
     */
    public static String encryptPassword(String password) throws NoSuchAlgorithmException {

        return new AES(SALT.getBytes()).encryptBase64(password);
    }

//    private byte[] generateSalt(){
//        Random random = new Random();
//        byte[] bytes = new byte[16];
//        random.nextBytes(bytes);
//        return bytes;
//    }
    /**
     * 判断密码是否相同
     *
     * @param rawPassword     真实密码 123
     * @param encodedPassword 加密后字符 base64
     * @return 结果
     */
    public static boolean matchesPassword(String rawPassword, String encodedPassword) {
        String decodeStr =new AES(SALT.getBytes()).decryptStr(encodedPassword);
        return decodeStr.equals(rawPassword);
    }

    public static void main(String[] args) {
        AES aes = SecureUtil.aes(SALT.getBytes(StandardCharsets.UTF_8));

        String encodedPassword = aes.encryptBase64("123456");
        System.out.println(encodedPassword);
        String decodeStr =aes.decryptStr(encodedPassword);
        System.out.println(decodeStr);


    }
}
