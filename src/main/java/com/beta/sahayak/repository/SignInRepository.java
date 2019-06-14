package com.beta.sahayak.repository;

import com.beta.sahayak.dao.UserDetails;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface SignInRepository extends CassandraRepository<UserDetails,String> {
}
