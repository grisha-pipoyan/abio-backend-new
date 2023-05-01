package com.brutus.abio.persistance.video;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Video {

    @Id
    @GeneratedValue
    private Long Id;
    @Column(columnDefinition = "TEXT")
    private String title_en;
    @Column(columnDefinition = "TEXT")
    private String title_ru;
    @Column(columnDefinition = "TEXT")
    private String title_am;
    @Column(columnDefinition = "TEXT")
    private String description_en;
    @Column(columnDefinition = "TEXT")
    private String description_ru;
    @Column(columnDefinition = "TEXT")
    private String description_am;
    private String date;
    @Column(columnDefinition = "TEXT")
    private String url;

}
