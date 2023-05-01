package com.brutus.abio.utils;//package com.brutus.abio.utils;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Optional;
//import java.util.UUID;
//
//public class CookieUtils {
//
//    public final static String ORDER_ID = "orderId";
//    public final static String CART_ID = "cartId";
//    public final static String JWT_TOKEN = "jwtToken";
//
//    public static Cookie createCartIdCookie(UUID cartId){
//        // Set the cart ID in a cookie
//        Cookie cookie = new Cookie(CART_ID, cartId.toString());
//        cookie.setSecure(true);
//        //cookie.setHttpOnly(true);
//        //cookie.setDomain("localhost");
//        cookie.setMaxAge(3600);
//        cookie.setPath("/");
//        return cookie;
//    }
//
//    public static Cookie createOrderIdCookie(String orderId){
//        // Set the order ID in a cookie
//        Cookie cookie = new Cookie(ORDER_ID, orderId);
//        cookie.setSecure(true);
//        cookie.setHttpOnly(true);
//        cookie.setDomain("localhost");
//        cookie.setPath("/");
//        cookie.setMaxAge(900);
//
//        return cookie;
//    }
//
//    public static Cookie createJwtTokenCookie(String jwtToken){
//        Cookie cookie = new Cookie(JWT_TOKEN, jwtToken);
//        cookie.setSecure(true);
//        cookie.setHttpOnly(true);
//        cookie.setDomain("localhost");
//        cookie.setPath("/");
//        cookie.setMaxAge(900);
//
//        return cookie;
//    }
//
//    public static void updateCartIdCookie(UUID newValue, HttpServletRequest request, HttpServletResponse response) {
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals(CART_ID)) {
//                    cookie.setValue(newValue.toString());
//                    cookie.setSecure(true);
//                    cookie.setHttpOnly(true);
//                    cookie.setDomain("localhost");
//                    cookie.setMaxAge(3600);
//                    cookie.setPath("/");
//                    response.addCookie(cookie);
//                    break;
//                }
//            }
//        }
//    }
//
//    public static Optional<UUID> getCookieFromRequest(String cookieName, HttpServletRequest request) {
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals(cookieName)) {
//                    return Optional.of(UUID.fromString(cookie.getValue()));
//                }
//            }
//        }
//        return Optional.empty();
//    }
//
//    public static Optional<String> getOrderCookieFromRequest(HttpServletRequest request){
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals(ORDER_ID)) {
//                    return cookie.getValue().describeConstable();
//                }
//            }
//        }
//
//        return Optional.empty();
//    }
//
//    public static void removeCookieFromResponse(String cookieName, HttpServletResponse response) {
//        // Remove the cart ID cookie or JWT from the response
//        Cookie cookie = new Cookie(cookieName, "");
//        cookie.setMaxAge(0);
//        response.addCookie(cookie);
//        // Or remove the cart ID from the JWT (not shown here)
//    }
//}
