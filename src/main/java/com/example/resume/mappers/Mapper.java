package com.example.resume.mappers;

/**
 * Описывает логику маппинга.
 *
 * @param <Entity> сущность
 * @param <Dto>    дто
 */
public interface Mapper<Entity, Dto> {
    /**
     * Создает экземпляр DTO из сущности.
     *
     * @param entity сущность
     * @return DTO
     */
    Dto dtoFromEntity(Entity entity);

    /**
     * Создает экземпляр сущности из DTO
     *
     * @param dto DTO
     * @return сущность
     */
    Entity entityFromDto(Dto dto);
}
