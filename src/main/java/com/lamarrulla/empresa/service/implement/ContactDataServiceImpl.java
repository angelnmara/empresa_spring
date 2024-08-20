package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.ContactDataDto;
import com.lamarrulla.empresa.mapper.implement.ContactDataMapperImpl;
import com.lamarrulla.empresa.repository.IContactDataRepository;
import com.lamarrulla.empresa.service.IContactDataService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactDataServiceImpl implements IContactDataService {
    private final IContactDataRepository contactDataRepository;
    private final ContactDataMapperImpl contactDataMapper;

    public ContactDataServiceImpl(IContactDataRepository contactDataRepository, ContactDataMapperImpl contactDataMapper) {
        this.contactDataRepository = contactDataRepository;
        this.contactDataMapper = contactDataMapper;
    }

    @Override
    public ContactDataDto findById(Integer id) {
        return contactDataMapper.toDto(contactDataRepository.findById(id).get());
    }

    @Override
    public List<ContactDataDto> findAll() {
        return contactDataMapper.toDtoList(contactDataRepository.findAll());
    }

    @Override
    public ContactDataDto save(ContactDataDto contactDataDto) {
        return contactDataMapper.toDto(contactDataRepository.save(contactDataMapper.toEntity(contactDataDto)));
    }
}
