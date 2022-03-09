package com.quinbay.march22.dependencyinjection.repository;
import com.quinbay.march22.dependencyinjection.dto.Student;
        import org.springframework.data.mongodb.repository.MongoRepository;
        import org.springframework.data.repository.CrudRepository;



import com.quinbay.march22.dependencyinjection.entity.StudentEntityMongo;
import com.quinbay.march22.dependencyinjection.entity.StudentEntity;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentMongoRepository extends CrudRepository<StudentEntityMongo,Long> {
}
