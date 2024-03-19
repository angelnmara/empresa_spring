package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.CommunityCatDto;

import java.util.List;

public interface ICommunityCatService {
    CommunityCatDto findById(Integer Id);
    List<CommunityCatDto> findAll();
    CommunityCatDto save(CommunityCatDto communityCatDto);
}
