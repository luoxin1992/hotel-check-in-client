package cn.edu.xmu.ultraci.hotelcheckin.client.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BluetoothService extends Service {

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		return START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

}
