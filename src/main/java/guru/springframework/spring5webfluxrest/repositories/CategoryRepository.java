package guru.springframework.spring5webfluxrest.repositories;

import guru.springframework.spring5webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/9/18
 * Time: 6:03 PM
 **/
public interface CategoryRepository extends ReactiveMongoRepository <Category, String> {
}
