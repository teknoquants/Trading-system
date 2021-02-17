package com.db.tradingsystem.dao;

import com.db.tradingsystem.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<Trade,String> {
}
