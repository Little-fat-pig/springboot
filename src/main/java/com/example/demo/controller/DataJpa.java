package com.example.demo.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

/**
 * 这个注解表示这个接口不是Repository 的bean
 */
@NoRepositoryBean
public interface DataJpa extends PagingAndSortingRepository {
    @Override
    Iterable findAll(Sort sort);

    @Override
    Page findAll(Pageable pageable);

    @Override
    Object save(Object o);

    @Override
    Iterable saveAll(Iterable iterable);

    @Override
    Optional findById(Object o);

    @Override
    boolean existsById(Object o);

    @Override
    Iterable findAll();

    @Override
    Iterable findAllById(Iterable iterable);

    @Override
    long count();

    @Override
    void deleteById(Object o);

    @Override
    void delete(Object o);

    @Override
    void deleteAllById(Iterable iterable);

    @Override
    void deleteAll(Iterable iterable);

    @Override
    void deleteAll();
}
