package guru.springframework.spring5webfluxrest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/9/18
 * Time: 7:17 PM
 **/
@Data
//@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {

//    @Id
    private String id;

    private String firstName;
    private String lastName;
}
