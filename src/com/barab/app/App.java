package com.barab.app;

import javax.swing.SwingUtilities;

import com.barab.dao.ItemDao;
import com.barab.presenter.UninamePresenter;
import com.barab.view.MainView;

public class App {

	public App() {
		
//		View view = new View();
//		ItemDao itemDao = new ItemDao();
//		VendorDao vendorDao = new VendorDao();
//		DeliveryDao deliveryDao = new DeliveryDao();
		ItemDao itemDao = new ItemDao();
		System.out.println(itemDao.save());
		MainView mainView = new MainView();
		
		@SuppressWarnings("unused")
//		WarehousePresenter warehousePresenter = new WarehousePresenter(view, itemDao, vendorDao, deliveryDao);
		UninamePresenter uninamePresenter = new UninamePresenter(mainView);
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new App();
			}
		});
		
	}


}
