package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.RoleCatDto;
import com.lamarrulla.empresa.mapper.IRoleCatMapper;
import com.lamarrulla.empresa.repository.IRoleCatRepository;
import com.lamarrulla.empresa.service.IRoleCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleCatServiceImpl implements IRoleCatService {
    private final IRoleCatRepository iRoleCatRepository;
    private final IRoleCatMapper iRoleCatMapper;

    public RoleCatServiceImpl(IRoleCatRepository iRoleCatRepository, IRoleCatMapper iRoleCatMapper) {
        this.iRoleCatRepository = iRoleCatRepository;
        this.iRoleCatMapper = iRoleCatMapper;
    }

    @Override
    public RoleCatDto findById(Integer Id) {
        return iRoleCatMapper.toDTO(iRoleCatRepository.findById(Id).get());
    }

    @Override
    public List<RoleCatDto> findAll() {
        return iRoleCatMapper.toDTOList(iRoleCatRepository.findAll());
    }

    @Override
    public RoleCatDto save(RoleCatDto roleCatDto) {
        return iRoleCatMapper.toDTO(iRoleCatRepository.save(iRoleCatMapper.toEntity(roleCatDto)));
    }
}
