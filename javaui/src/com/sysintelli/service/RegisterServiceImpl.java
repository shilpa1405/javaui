package com.sysintelli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sysintelli.model.Register;
import com.sysintelli.repository.SysintelliRepository;


@Service("RegisterService")
public abstract class RegisterServiceImpl implements RegisterService{
	  @Autowired
	  private SysintelliRepository sysintelliRepository;
	  
	  @Transactional
	  public RegisterService save(Register register) {
	      return SysintelliRepository.save(register);
	  }

	  public boolean findByLogin(String userName, String passid) {  
	      Register stud = sysintelliRepository.findByUserName(userName);
	      
	      if(stud != null && stud.getPassid().equals(passid)) {
	          return true;
	      } 
	      
	      return false;       
	  }

	  public boolean findByUserName(String userName) {
	      Register stud = sysintelliRepository.findByUserName(userName);
	      
	      if(stud != null) {
	          return true;
	      }
	      
	      return false;
	  }

	}

