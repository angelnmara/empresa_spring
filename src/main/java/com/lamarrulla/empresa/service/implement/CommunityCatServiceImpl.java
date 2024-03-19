package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CommunityCatDto;
import com.lamarrulla.empresa.mapper.ICommunityCatMapper;
import com.lamarrulla.empresa.repository.ICommunityCatRepository;
import com.lamarrulla.empresa.service.ICommunityCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommunityCatServiceImpl implements ICommunityCatService {
    private final ICommunityCatRepository iCommunityCatRepository;
    private final ICommunityCatMapper iCommunityCatMapper;

    public CommunityCatServiceImpl(ICommunityCatRepository iCommunityCatRepository, ICommunityCatMapper iCommunityCatMapper) {
        this.iCommunityCatRepository = iCommunityCatRepository;
        this.iCommunityCatMapper = iCommunityCatMapper;
    }

    @Override
    public CommunityCatDto findById(Integer Id) {
        return iCommunityCatMapper.toDto(iCommunityCatRepository.findById(Id).get());
    }

    @Override
    public List<CommunityCatDto> findAll() {
        return iCommunityCatMapper.toDtoList(iCommunityCatRepository.findAll());
    }

    @Override
    public CommunityCatDto save(CommunityCatDto communityCatDto) {
        return iCommunityCatMapper.toDto(iCommunityCatRepository.save(iCommunityCatMapper.toEntity(communityCatDto)));
    }
}
