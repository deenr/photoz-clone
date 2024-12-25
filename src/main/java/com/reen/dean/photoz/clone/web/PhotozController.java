package com.reen.dean.photoz.clone.web;

import com.reen.dean.photoz.clone.model.Photo;
import com.reen.dean.photoz.clone.service.PhotozService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@RestController
public class PhotozController {
    private final PhotozService photozService;

    public PhotozController(@Autowired PhotozService photozService) {
        this.photozService = photozService;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/photoz")
    public Iterable<Photo> get() {
        return photozService.get();
    }

    @GetMapping("/photoz/{id}")
    public Photo get(@PathVariable Integer id) {
        Photo photo = photozService.get(id);
        if(photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photozService.get(id);
    }

    @DeleteMapping("/photoz/{id}")
    public void delete(@PathVariable Integer id) {
        photozService.remove(id);
    }

    @PostMapping("/photoz")
    public Photo create(@RequestPart("data") MultipartFile file) throws IOException {
        Photo photo = photozService.put(file.getOriginalFilename(), file.getContentType(), file.getBytes());

        return photo;
    }
}
