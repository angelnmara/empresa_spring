package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.TokenDataDto;
import com.lamarrulla.empresa.mapper.ITokenDataMapper;
import com.lamarrulla.empresa.repository.ITokenDataRepository;
import com.lamarrulla.empresa.service.ITokenDataService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TokenDataServiceImpl implements ITokenDataService {

    private final ITokenDataMapper iTokenDataMapper;
    private final ITokenDataRepository iTokenDataRepository;

    public TokenDataServiceImpl(ITokenDataMapper iTokenDataMapper, ITokenDataRepository iTokenDataRepository) {
        this.iTokenDataMapper = iTokenDataMapper;
        this.iTokenDataRepository = iTokenDataRepository;
    }

    @Override
    public TokenDataDto findById(Integer id) {
        return iTokenDataMapper.toDTO(iTokenDataRepository.findById(id).get());
    }

    @Override
    public TokenDataDto save(TokenDataDto tokenDataDto) {
        return iTokenDataMapper.toDTO(iTokenDataRepository.save(iTokenDataMapper.toEntity(tokenDataDto)));
    }

    @Override
    public List<TokenDataDto> findAll() {
        return iTokenDataMapper.toDTOList(iTokenDataRepository.findAll());
    }
}
