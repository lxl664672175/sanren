package cn.itcast.service.impl;

import cn.itcast.dao.IAdminDao;
import cn.itcast.dao.impl.AdminDao;
import cn.itcast.entity.Admin;
import cn.itcast.service.IAdminService;

public class AdminService implements IAdminService {
	
	// ע��dao  ������һ��Ҫ�ýӿڽ��ա�
	private IAdminDao adminDao; //JDK
	public void setAdminDao(IAdminDao adminDao) {
		this.adminDao = adminDao;
	}	

	@Override
	public Admin login(Admin admin) {
		return adminDao.findByAdmin(admin);
	}

	@Override
	public void register(Admin admin) {
		adminDao.save(admin);
	}

}
