package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class MannagerDto {
    private Long id;
    private PersonalDataDto personalDataDto;
    private ContactDataDto contactDataDto;
}
