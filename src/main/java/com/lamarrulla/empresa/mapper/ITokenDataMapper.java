package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.AlliDto.TokenDataDto;
import com.lamarrulla.empresa.entity.Alli.TokenData;

import java.util.List;

public interface ITokenDataMapper {
    TokenData toEntity(TokenDataDto tokenDataDto);
    TokenDataDto toDTO(TokenData tokenData);
    List<TokenDataDto> toDTOList(List<TokenData> tokenDataList);
}
