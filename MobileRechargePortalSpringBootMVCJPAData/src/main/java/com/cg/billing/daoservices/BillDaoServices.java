package com.cg.billing.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.billing.beans.Bill;
public interface BillDaoServices extends JpaRepository<Bill,Integer>{
	@Query(value="from Bill b where PostpaidAccountMobileNo=:mobileNo and BillMonth=:billMonth")
	Bill getMonthlyMobileBill(long mobileNo, String billMonth);
}

