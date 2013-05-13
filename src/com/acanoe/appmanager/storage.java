package com.acanoe.appmanager;

import java.io.File;

import android.app.Activity;
import android.app.Service;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.Formatter;
import android.util.Log;

public class storage extends Activity{
	private static final String TAG = "Java";

	// ������ֻ��ڴ�Ŀ��ÿռ��С

	static public long getAvailableInternalMemorySize() {
		File path = Environment.getDataDirectory();
		StatFs stat = new StatFs(path.getPath());
		long blockSize = stat.getBlockSize();
		long availableBlocks = stat.getAvailableBlocks();
		return availableBlocks * blockSize;
	}

	// ������ֻ��ڴ���ܿռ��С

	static public long getTotalInternalMemorySize() {
		File path = Environment.getDataDirectory();
		StatFs stat = new StatFs(path.getPath());
		long blockSize = stat.getBlockSize();
		long totalBlocks = stat.getBlockCount();
		return totalBlocks * blockSize;
	}

//	// ������ֻ�sdcard�Ŀ��ÿռ��С
//
//	static public long getAvailableExternalMemorySize() {
//		if (externalMemoryAvailable()) {
//			File path = Environment.getExternalStorageDirectory();
//			StatFs stat = new StatFs(path.getPath());
//			long blockSize = stat.getBlockSize();
//			long availableBlocks = stat.getAvailableBlocks();
//			return availableBlocks * blockSize;
//		} else {
//			return ERROR;
//		}
//	}
//
//	// ������ֻ�sdcard���ܿռ��С
//
//	static public long getTotalExternalMemorySize() {
//		if (externalMemoryAvailable()) {
//			File path = Environment.getExternalStorageDirectory();
//			StatFs stat = new StatFs(path.getPath());
//			long blockSize = stat.getBlockSize();
//			long totalBlocks = stat.getBlockCount();
//			return totalBlocks * blockSize;
//		} else {
//			return ERROR;
//		}
//	}

	private  void updateMemoryStatus() {
		String status = Environment.getExternalStorageState();
		String readOnly = "";
		// �Ƿ�ֻ��
		if (status.equals(Environment.MEDIA_MOUNTED_READ_ONLY)) {
			status = Environment.MEDIA_MOUNTED;
			// readOnly = getString(R.string.read_only);
		}
		if (status.equals(Environment.MEDIA_MOUNTED)) {
			try {
				File path = Environment.getExternalStorageDirectory();
				StatFs stat = new StatFs(path.getPath());
				long blockSize = stat.getBlockSize();
				long totalBlocks = stat.getBlockCount();
				long availableBlocks = stat.getAvailableBlocks();
				// SD��������
				String sdSize = formatSize(totalBlocks * blockSize);
				Log.i(TAG, "SD��������: " + sdSize);
				// SD��ʣ������
				String sdAvail = formatSize(availableBlocks * blockSize)
						+ readOnly;
				Log.i(TAG, "SD��ʣ������: " + sdAvail);
			} catch (IllegalArgumentException e) {
				status = Environment.MEDIA_REMOVED;
			}
		}
		File path = Environment.getDataDirectory();
		StatFs stat = new StatFs(path.getPath());
		long blockSize = stat.getBlockSize();
		long availableBlocks = stat.getAvailableBlocks();
		// �ֻ��ڴ�ʣ������
		String memoryAvail = formatSize(availableBlocks * blockSize);
		Log.i(TAG, "�ֻ��ڴ�ʣ������: " + memoryAvail);
		long totalBlocks = stat.getBlockCount();
		// �ֻ��ڴ�������
		String memorySize = formatSize(totalBlocks * blockSize);
		Log.i(TAG, "�ֻ��ڴ�������: " + memorySize);
		
	}

	// ��ʽ�� ת��Ϊ.MB��ʽ
	private String formatSize(long size) {
		return Formatter.formatFileSize(this, size);

	}

}
