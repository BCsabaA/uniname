package com.barab.app;

import java.io.IOException;
import java.util.List;

import javax.swing.SwingUtilities;

import com.barab.dao.RoleDao;
import com.barab.dao.RoleDao;
import com.barab.model.Role;
import com.barab.presenter.UninamePresenter;
import com.barab.view.MainView;

public class App {

	public App() {
		
//		View view = new View();
//		ItemDao itemDao = new ItemDao();
//		VendorDao vendorDao = new VendorDao();
//		DeliveryDao deliveryDao = new DeliveryDao();
		
//		RoleDaoOld roleDao = new RoleDaoOld();
//		
//		Long id = 3L;
//		
//		Role role = roleDao.getById(id);
//		System.out.println("id:" + id + " = " + role.toString());
//		
//		List<Role> roles = roleDao.getAll();
//		roles.stream().forEach(r->System.out.println(r.toString()));

		RoleDao roleDao = new RoleDao();
		
		Role role = roleDao.findById(2L);
		System.out.println(role.toString());
		
		List<Role> roles = roleDao.getAll();
		roles.stream().forEach(r->System.out.println(r.toString()));
		
		MainView mainView = new MainView();
			
		@SuppressWarnings("unused")
//		WarehousePresenter warehousePresenter = new WarehousePresenter(view, itemDao, vendorDao, deliveryDao);
		UninamePresenter uninamePresenter = new UninamePresenter(mainView);
		
	}
	
	public static void main(String[] args) throws IOException{
		
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					new App();
				}
			});
		
	}


}
