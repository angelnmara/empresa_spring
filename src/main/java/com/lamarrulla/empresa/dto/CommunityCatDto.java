package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class CommunityCatDto {
    private Long id;
    private String communityName;
    private Long ZipCode;
    private CityCatDto cityCatDto;
}
