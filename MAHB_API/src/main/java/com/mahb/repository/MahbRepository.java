package com.mahb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahb.viewModels.SingleToken;


@Repository
public interface MahbRepository  extends JpaRepository<SingleToken, String> { 

}
