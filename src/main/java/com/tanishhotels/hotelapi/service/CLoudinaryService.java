package com.tanishhotels.hotelapi.service;

import com.cloudinary.Cloudinary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CLoudinaryService {

    private final Cloudinary cloudinary;

    public String uploadFile(MultipartFile file) {
        try{
            System.out.println("uploading");
            HashMap<Object, Object> options = new HashMap<>();
            options.put("folder", "hotel rooms images");
            Map uploadedFile = cloudinary.uploader().upload(file.getBytes(), options);
            return uploadedFile.get("secure_url").toString();
        }catch ( IOException e){
            throw new RuntimeException("Image uploading fail");

        }
    }
}
