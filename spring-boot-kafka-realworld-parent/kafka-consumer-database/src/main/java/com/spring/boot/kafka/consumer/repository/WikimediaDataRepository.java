package com.spring.boot.kafka.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.kafka.consumer.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
