package com.example.finalUrl.service;

import com.example.finalUrl.dao.URLRepository;
import com.example.finalUrl.model.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    URLRepository urlRepository;
public void save(URL url) {

    urlRepository.save(url);




}

}
