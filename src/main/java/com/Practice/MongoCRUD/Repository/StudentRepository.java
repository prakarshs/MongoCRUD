package com.Practice.MongoCRUD.Repository;

import com.Practice.MongoCRUD.Collections.Students;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Students,String> {
}
