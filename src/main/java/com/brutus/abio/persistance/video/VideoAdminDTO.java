package com.brutus.abio.persistance.video;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoAdminDTO {
    private Long Id;
    private String title_en;
    private String title_ru;
    private String title_am;
    private String description_en;
    private String description_ru;
    private String description_am;
    private String date;
    private String url;
}
