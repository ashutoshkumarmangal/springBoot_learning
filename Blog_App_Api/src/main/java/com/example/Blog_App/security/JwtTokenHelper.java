//package com.example.Blog_App.security;
//
//import java.sql.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import lombok.Data;
//
//@Component
//public class JwtTokenHelper {
//
//	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
//	
//	private String secret = "jwtTokenKey";
//	
//	//retrieve username from jwt token
//	public String getUsernameFromToken(String token) {
//		return getClaimFromToken(token, Claims::getSubject);
//	}
//	
//	//retrieve expiration date from jwt token
//	public Data getExpirationDateFromToken(String token) {
//		return getClaimFromToken(token, Claims::getExpiration);
//	}
//	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
//		final Claims claims = getAllClaimsFromToken(token);
//		return claimsResolver.apply(claims);
//	}
//	
//	//for retrieving any inforamtion from token we will need the secret key
//	private Claims getAllClaimsFromToken(String token) {
//		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//	}
//	//check if the token has expired
//	private Boolean isTokenExpired(String token) {
//		final Date expiration = getExprationDateFromToken(token);
//		return expiration.before(new Date());
//	}
//	
//	//generate token for user
//	public String generateToken(UserDetails userDetails) {
//		Map<String, Object>claims = new HashMap<>();
//		return doGenerateToken(claims,userDetails.getUsername());
//	}
//	
//	
//	
//}
