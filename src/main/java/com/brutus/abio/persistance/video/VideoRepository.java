package com.brutus.abio.persistance.video;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VideoRepository extends JpaRepository<Video, Long> {

}
