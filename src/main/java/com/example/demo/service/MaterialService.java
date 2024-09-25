package com.example.demo.service;

import com.example.demo.dto.MaterialDTO;

import java.util.List;

public interface MaterialService {
    public void register(MaterialDTO materialDTO);
    public List<MaterialDTO> selectAll();
    public void update(MaterialDTO materialDTO);

}
