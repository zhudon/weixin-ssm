package com.zain.web.utils;

import javax.servlet.http.Cookie;

/**
 * Cookie工具包
 * @author zain
 * 16/10/28
 */
public final class CookieUtil {
    private CookieUtil() {};
    
    /**
     * 获取Cookie值
     * 根据Cookie名
     * @param cookies
     * @param cookieName
     * @return 
     */
    public static String getCookieVal(Cookie[] cookies, String cookieName) {
        return getCookie(cookies, cookieName).getValue();
    }
    
    /**
     * 获取Cookie
     * 根据Cookie名
     * @param cookies
     * @param cookieName
     * @return
     */
    public static Cookie getCookie(Cookie[] cookies, String cookieName) {
        Cookie cookie = null;
        
        for(Cookie temp : cookies) {
            if(cookieName.equals(temp.getName())) {
                cookie = temp;
                break;
            }
        }
        
        return cookie;
    }
}
