package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.EmployeeCatDto;
import com.lamarrulla.empresa.mapper.IEmployeeCatMapper;
import com.lamarrulla.empresa.repository.IEmployeeCatRepository;
import com.lamarrulla.empresa.service.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeCatRepository iEmployeeCatRepository;
    private final IEmployeeCatMapper iEmployeeCatMapper;

    public EmployeeServiceImpl(IEmployeeCatRepository iEmployeeCatRepository, IEmployeeCatMapper iEmployeeCatMapper) {
        this.iEmployeeCatRepository = iEmployeeCatRepository;
        this.iEmployeeCatMapper = iEmployeeCatMapper;
    }

    @Override
    public EmployeeCatDto findById(Integer id) {
        return iEmployeeCatMapper.toDTO(iEmployeeCatRepository.findById(id).get());
    }

    @Override
    public List<EmployeeCatDto> findAll() {
        return iEmployeeCatMapper.toDTOList(iEmployeeCatRepository.findAll());
    }

    @Override
    public EmployeeCatDto save(EmployeeCatDto employeeCatDto) {
        return iEmployeeCatMapper.toDTO(iEmployeeCatRepository.save(iEmployeeCatMapper.toEntity(employeeCatDto)));
    }
}
