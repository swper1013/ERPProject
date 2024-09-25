package com.example.demo.service;

import com.example.demo.dto.MaterialDTO;
import com.example.demo.repository.MaterialRepository;
import com.example.demo.service.MaterialService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class MaterialServiceImpl implements MaterialService {
    private final MaterialRepository materialRepository;
    private ModelMapper mapper = new ModelMapper();

    @Override
    public void register(MaterialDTO materialDTO) {

    }

    @Override
    public List<MaterialDTO> selectAll() {
        return null;
    }

    @Override
    public void update(MaterialDTO materialDTO) {

    }
}
