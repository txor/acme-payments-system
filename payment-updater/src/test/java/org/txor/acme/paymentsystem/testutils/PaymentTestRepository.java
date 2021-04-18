package org.txor.acme.paymentsystem.testutils;

import org.springframework.data.repository.CrudRepository;
import org.txor.acme.paymentsystem.persistence.PaymentEntity;

public interface PaymentTestRepository extends CrudRepository<PaymentEntity, Long> {
}
