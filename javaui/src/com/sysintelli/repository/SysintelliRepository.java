/**
 * 
 */
package com.sysintelli.repository;

import org.hibernate.annotations.NamedQuery;
import org.jboss.logging.Param;
import org.springframework.stereotype.Repository;

import com.sysintelli.model.Register;
import com.sysintelli.service.RegisterService;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * @author Shilpa
 *
 */

@Repository("SysintelliRepository")

public interface SysintelliRepository extends JpaRepository<Register, Long> {

	@NamedQuery("select s from Register s where s.userName = :userName")

	Register findByUserName(@Param("userName") String userName);

	static RegisterService save(Register register) {
		// TODO Auto-generated method stub
		return null;
	}

}
