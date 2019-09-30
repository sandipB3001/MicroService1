package com.example.sandip.demoProject.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.sandip.demoProject.model.Book;

@Repository
public interface DemoRepository extends CassandraRepository<Book,Integer>{

}
