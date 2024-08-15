package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.allidto.TokenDataDto;
import com.lamarrulla.empresa.entity.alli.TokenData;

import java.util.List;

public interface ITokenDataMapper {
    TokenData toEntity(TokenDataDto tokenDataDto);
    TokenDataDto toDTO(TokenData tokenData);
    List<TokenDataDto> toDTOList(List<TokenData> tokenDataList);
}
