package com.fcrizante.journalhub.backend.Repository;

import com.fcrizante.journalhub.backend.Model.EncalheRevista;
import com.fcrizante.journalhub.backend.Model.EncalheRevistaId;
import org.springframework.data.repository.ListCrudRepository;

public interface EncalheRevistaRepository extends ListCrudRepository<EncalheRevista, EncalheRevistaId> {
}
