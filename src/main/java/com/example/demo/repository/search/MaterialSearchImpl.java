package com.example.demo.repository.search;

import com.example.demo.entity.MaterialEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

@Log4j2
public class MaterialSearchImpl extends QuerydslRepositorySupport implements MaterialSearch {

    public MaterialSearchImpl(){super(MaterialEntity.class);}



}