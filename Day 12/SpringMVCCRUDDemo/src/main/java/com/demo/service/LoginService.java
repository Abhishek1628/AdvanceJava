package com.demo.service;

import com.demo.model.MyUser;

public interface LoginService {

	MyUser validateUser(String uname, String pass);

}
