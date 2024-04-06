package com.example.bootcampmicroservice.domain.spi;

import com.example.bootcampmicroservice.domain.model.TechnologyModel;

public interface ITechnologyPersistencePort {

    TechnologyModel saveTechnology(TechnologyModel technologyModel);

//    List<TechnologyModel> getAllTechnologies();

}