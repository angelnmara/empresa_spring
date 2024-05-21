package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.TokenDataDto;
import com.lamarrulla.empresa.entity.TokenData;
import com.lamarrulla.empresa.mapper.ITokenDataMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class TokenDataMapperImpl implements ITokenDataMapper {
    @Override
    public TokenData toEntity(TokenDataDto tokenDataDto) {
        TokenData tokenData = new TokenData();
        tokenData.setAccess_token(tokenDataDto.getAccess_token());
        tokenData.setId(tokenDataDto.getId());
        tokenData.setCode(tokenDataDto.getCode());
        tokenData.setRefresh_token(tokenDataDto.getRefresh_token());
        tokenData.setAccount(tokenDataDto.getAccount());
        tokenData.setSp(tokenDataDto.getAccount());
        tokenData.setLocale(tokenDataDto.getLocale());
        tokenData.setExpires_in(tokenDataDto.getExpires_in());
        tokenData.setExpire_time(tokenDataDto.getExpire_time());
        tokenData.setHavana_id(tokenDataDto.getHavana_id());
        tokenData.setAccount_platform(tokenDataDto.getAccount_platform());
        tokenData.setRefresh_token_valid_time(tokenDataDto.getRefresh_token_valid_time());
        return tokenData;
    }

    @Override
    public TokenDataDto toDTO(TokenData tokenData) {
        TokenDataDto tokenDataDto = new TokenDataDto();
        tokenDataDto.setAccess_token(tokenData.getAccess_token());
        tokenDataDto.setRefresh_token(tokenData.getRefresh_token());
        tokenDataDto.setAccount(tokenData.getAccount());
        tokenDataDto.setCode(tokenData.getCode());
        tokenDataDto.setId(tokenData.getId());
        tokenDataDto.setLocale(tokenData.getLocale());
        tokenDataDto.setExpire_time(tokenData.getExpire_time());
        tokenDataDto.setSp(tokenData.getSp());
        tokenDataDto.setExpires_in(tokenData.getExpires_in());
        tokenDataDto.setHavana_id(tokenData.getHavana_id());
        tokenDataDto.setAccount_platform(tokenData.getAccount_platform());
        tokenDataDto.setRefresh_token_valid_time(tokenData.getRefresh_token_valid_time());
        tokenDataDto.setRefresh_token(tokenData.getRefresh_token());
        tokenDataDto.setUser_id(tokenData.getUser_id());
        tokenDataDto.setRequest_id(tokenData.getRequest_id());
        tokenDataDto.setSeller_id(tokenData.getSeller_id());
        return tokenDataDto;
    }

    @Override
    public List<TokenDataDto> toDTOList(List<TokenData> tokenDataList) {
        return tokenDataList.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
