package guru.springframework.spring5webfluxrest.repositories;

import guru.springframework.spring5webfluxrest.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/9/18
 * Time: 7:18 PM
 **/
public interface VendorRepository extends ReactiveMongoRepository <Vendor, String> {
}
