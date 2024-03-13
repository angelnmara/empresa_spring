package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.PersonalDataDto;
import com.lamarrulla.empresa.mapper.IPersonalDataMapper;
import com.lamarrulla.empresa.repository.IPersonalDataRepository;
import com.lamarrulla.empresa.service.IPersonalDataService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonalDataImpl implements IPersonalDataService {
    private final IPersonalDataRepository iPersonalDataRepository;
    private final IPersonalDataMapper iPersonalDataMapper;

    public PersonalDataImpl(IPersonalDataRepository iPersonalDataRepository, IPersonalDataMapper iPersonalDataMapper) {
        this.iPersonalDataRepository = iPersonalDataRepository;
        this.iPersonalDataMapper = iPersonalDataMapper;
    }

    @Override
    public PersonalDataDto findById(Integer id) {
        return iPersonalDataMapper.toDTO(iPersonalDataRepository.findById(id).get());
    }

    @Override
    public List<PersonalDataDto> findAll() {
        return iPersonalDataMapper.toDTOList(iPersonalDataRepository.findAll());
    }

    @Override
    public PersonalDataDto save(PersonalDataDto personalDataDto) {
        return iPersonalDataMapper.toDTO(iPersonalDataRepository.save(iPersonalDataMapper.toEntity(personalDataDto)));
    }
}
