package com.drumond.backend.usercontext.mapper;

import com.drumond.backend.usercontext.domain.ReadUserDTO;
import com.drumond.backend.usercontext.domain.User;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    User toEntity(ReadUserDTO readUserDTO);

    ReadUserDTO toDTO(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(ReadUserDTO readUserDTO, @MappingTarget User user);
}