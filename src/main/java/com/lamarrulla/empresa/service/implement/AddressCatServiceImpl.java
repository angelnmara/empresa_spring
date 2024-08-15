package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.dto.AddressCatDto;
import com.lamarrulla.empresa.mapper.IAddressCatMapper;
import com.lamarrulla.empresa.repository.IAddressCatRepository;
import com.lamarrulla.empresa.service.IAddressCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressCatServiceImpl implements IAddressCatService {
    private final IAddressCatRepository iAddressCatRepository;
    private final IAddressCatMapper iAddressCatMapper;

    public AddressCatServiceImpl(IAddressCatRepository iAddressCatRepository, IAddressCatMapper iAddressCatMapper) {
        this.iAddressCatRepository = iAddressCatRepository;
        this.iAddressCatMapper = iAddressCatMapper;
    }

    @Override
    public AddressCatDto findById(Integer id) {
        return iAddressCatMapper.toDto(iAddressCatRepository.findById(id).get());
    }

    @Override
    public List<AddressCatDto> findAll() {
        return iAddressCatMapper.toDtoList(iAddressCatRepository.findAll());
    }

    @Override
    public AddressCatDto save(AddressCatDto addressCatDto) {
        return iAddressCatMapper.toDto(iAddressCatRepository.save(iAddressCatMapper.toEntity(addressCatDto)));
    }
}
