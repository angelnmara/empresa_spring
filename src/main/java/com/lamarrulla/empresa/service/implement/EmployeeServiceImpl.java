package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.dto.EmployeeCatDto;
import com.lamarrulla.empresa.mapper.IEmployeeCatMapper;
import com.lamarrulla.empresa.repository.IEmployeeRepository;
import com.lamarrulla.empresa.service.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepository iEmployeeRepository;
    private final IEmployeeCatMapper iEmployeeCatMapper;

    public EmployeeServiceImpl(IEmployeeRepository iEmployeeRepository, IEmployeeCatMapper iEmployeeCatMapper) {
        this.iEmployeeRepository = iEmployeeRepository;
        this.iEmployeeCatMapper = iEmployeeCatMapper;
    }

    @Override
    public EmployeeCatDto findById(Integer id) {
        return iEmployeeCatMapper.toDTO(iEmployeeRepository.findById(id).get());
    }

    @Override
    public List<EmployeeCatDto> findAll() {
        return iEmployeeCatMapper.toDTOList(iEmployeeRepository.findAll());
    }

    @Override
    public EmployeeCatDto save(EmployeeCatDto employeeCatDto) {
        return iEmployeeCatMapper.toDTO(iEmployeeRepository.save(iEmployeeCatMapper.toEntity(employeeCatDto)));
    }
}
