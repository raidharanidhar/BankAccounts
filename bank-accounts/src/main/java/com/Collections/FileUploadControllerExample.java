package com.Collections;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;

@RestController
public class FileUploadControllerExample {

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "Please select a file to upload";
        }

        try {
            // Get the file bytes and save it
            byte[] bytes = file.getBytes();
            // Define the file path where you want to save the uploaded file
            String filePath = "/path/to/save/" + file.getOriginalFilename();
            BufferedOutputStream stream =
                    new BufferedOutputStream(new FileOutputStream(new File(filePath)));
            stream.write(bytes);
            stream.close();
            return "File uploaded successfully: " + file.getOriginalFilename();
        } catch (IOException e) {
            return "Failed to upload " + file.getOriginalFilename() + ": " + e.getMessage();
        }
    }
}
