package com.barab.presenter;

import com.barab.view.MainView;
import com.barab.view.listener.IViewListener;

public class UninamePresenter implements IViewListener {
	
	private MainView mainView;

	public UninamePresenter(MainView mainView) {
		this.mainView = mainView;
		this.mainView.addListener(this);
	}

	@Override
	public void onButtonNewNameClicked() {
		System.out.println("'Új elnevezés' gomb megnyomva.");
	}

}
