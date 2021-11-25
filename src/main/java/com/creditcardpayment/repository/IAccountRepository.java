package com.creditcardpayment.repository;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.creditcardpayment.entity.AccountEntity;

@Repository
public interface IAccountRepository extends JpaRepository<AccountEntity, String>{


	
}