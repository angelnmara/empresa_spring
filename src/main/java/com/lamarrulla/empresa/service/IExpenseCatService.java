package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.ExpenseCatDto;

import java.util.List;

public interface IExpenseCatService {
    ExpenseCatDto findById(Integer id);
    List<ExpenseCatDto> findAll();
    ExpenseCatDto save(ExpenseCatDto expenseCatDto);
}
