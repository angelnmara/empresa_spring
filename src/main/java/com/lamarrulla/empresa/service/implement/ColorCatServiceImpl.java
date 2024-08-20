package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.ColorCatDto;
import com.lamarrulla.empresa.mapper.implement.ColorCatMapperImpl;
import com.lamarrulla.empresa.repository.IColorCatRepository;
import com.lamarrulla.empresa.service.IColorCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ColorCatServiceImpl implements IColorCatService {
    private final IColorCatRepository iColorCatRepository;
    private final ColorCatMapperImpl colorCatMapper;

    public ColorCatServiceImpl(IColorCatRepository iColorCatRepository, ColorCatMapperImpl colorCatMapper) {
        this.iColorCatRepository = iColorCatRepository;
        this.colorCatMapper = colorCatMapper;
    }

    @Override
    public ColorCatDto findById(Integer id) {
        return colorCatMapper.toDto(iColorCatRepository.findById(id).get());
    }

    @Override
    public ColorCatDto save(ColorCatDto colorCatDto) {
        return colorCatMapper.toDto(iColorCatRepository.save(colorCatMapper.toEntity(colorCatDto)));
    }

    @Override
    public List<ColorCatDto> findAll() {
        return colorCatMapper.toDtoList(iColorCatRepository.findAll());
    }
}
