package com.baemongsil.memo.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtils {

	//암호화 메소드 
	public static String md5(String message) {
		String resultData = "";
		
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			
			//문자열을 BYTE 배열로 변
			byte[] bytes = message.getBytes();
			// 암호화 셋팅
			md.update(bytes);
			
			//암호화된 결과 얻기 
			byte[] digest = md.digest();
			//byte 배열 -> 16진수 문자열로 바꾸기
			
			for(int i = 0; i < digest.length; i++) {
				resultData += Integer.toHexString(digest[i] & 0xff);
			}
			
		} catch (NoSuchAlgorithmException e) {
			
			e.printStackTrace();
			return null;
		}
		
		return resultData;
		
		
		
	}
	
	
}
