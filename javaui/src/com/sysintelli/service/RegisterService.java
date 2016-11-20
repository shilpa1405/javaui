/**
 * 
 */
package com.sysintelli.service;

import com.sysintelli.model.Register;

/**
 * @author Shilpa
 *
 */
public interface RegisterService {

		  RegisterService save(Register register);
		  boolean findByLogin(String userName, String passid);
		  boolean findByUserName(String userName);
		}

