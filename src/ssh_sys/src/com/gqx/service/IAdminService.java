package com.gqx.service;

import com.gqx.entity.Admin;

public interface IAdminService {
	void register(Admin admin);

	Admin login(Admin admin);
}
