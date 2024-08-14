package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.EmployeeCatDto;
import com.lamarrulla.empresa.mapper.IEmployeeMapper;
import com.lamarrulla.empresa.repository.IEmployeeRepository;
import com.lamarrulla.empresa.service.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepository iEmployeeRepository;
    private final IEmployeeMapper iEmployeeMapper;

    public EmployeeServiceImpl(IEmployeeRepository iEmployeeRepository, IEmployeeMapper iEmployeeMapper) {
        this.iEmployeeRepository = iEmployeeRepository;
        this.iEmployeeMapper = iEmployeeMapper;
    }

    @Override
    public EmployeeCatDto findById(Integer id) {
        return iEmployeeMapper.toDTO(iEmployeeRepository.findById(id).get());
    }

    @Override
    public List<EmployeeCatDto> findAll() {
        return iEmployeeMapper.toDTOList(iEmployeeRepository.findAll());
    }

    @Override
    public EmployeeCatDto save(EmployeeCatDto employeeCatDto) {
        return iEmployeeMapper.toDTO(iEmployeeRepository.save(iEmployeeMapper.toEntity(employeeCatDto)));
    }
}
