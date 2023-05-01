package com.brutus.abio.persistance.video;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoDTO {
    private Long Id;
    private String title;
    private String description;
    private String date;
    private String url;
}
