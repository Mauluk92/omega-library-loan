package it.aleph.omega.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import it.aleph.omega.model.enums.Status;
import lombok.Data;
import org.bson.types.ObjectId;

import java.time.Instant;
import java.util.List;

@MongoEntity
@Data
public class Loan {
    private ObjectId id;
    private List<Long> bookIdListBorrowed;
    private Instant startDate;
    private Instant endDate;
    private String address;
    private String name;
    private String surname;
    private String email;
    private String taxCode;
    private Status status;
}
