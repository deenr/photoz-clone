package com.reen.dean.photoz.clone.service;

import com.reen.dean.photoz.clone.model.Photo;
import com.reen.dean.photoz.clone.repository.PhotozRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class PhotozService {

    private final PhotozRepository photozRepository;

    public PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }

    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photozRepository.deleteById(id);
    }

    public Photo put(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();

        photo.setFileName(fileName);
        photo.setContentType(contentType);
        photo.setData(data);

        photozRepository.save(photo);

        return photo;
    }
}
