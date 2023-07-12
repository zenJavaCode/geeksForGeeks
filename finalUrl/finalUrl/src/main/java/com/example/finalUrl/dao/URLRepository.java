package com.example.finalUrl.dao;

import com.example.finalUrl.model.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepository extends JpaRepository<URL,String> {


}
