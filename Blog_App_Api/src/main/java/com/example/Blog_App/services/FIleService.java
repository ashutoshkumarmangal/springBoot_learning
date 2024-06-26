package com.example.Blog_App.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FIleService {

	String uploadImage(String path, MultipartFile file) throws IOException;
	InputStream getResource(String path,String filename) throws FileNotFoundException;
}
