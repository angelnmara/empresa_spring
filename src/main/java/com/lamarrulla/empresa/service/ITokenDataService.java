package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.TokenDataDto;

import java.util.List;

public interface ITokenDataService {
    TokenDataDto findById(Integer id);
    TokenDataDto save(TokenDataDto tokenDataDto);
    List<TokenDataDto> findAll();
}
