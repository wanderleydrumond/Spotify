package com.drumond.backend.catalogcontext.application.mapper;

import com.drumond.backend.catalogcontext.application.dto.SongContentDTO;
import com.drumond.backend.catalogcontext.domain.SongContent;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SongContentMapper {
    SongContent toEntity(SongContentDTO songContentDTO);

    SongContentDTO toDto(SongContent songContent);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SongContent partialUpdate(SongContentDTO songContentDTO, @MappingTarget SongContent songContent);
}