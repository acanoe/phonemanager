package com.acanoe.appmanager;

import java.io.InputStream;
import java.util.ArrayList;

import android.app.ListActivity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.Photo;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class ContactsActivity extends ListActivity {

//	Context mContext = null;
//
//	/** ��ȡ��Phon���ֶ� **/
//	private static final String[] PHONES_PROJECTION = new String[] {
//			Phone.DISPLAY_NAME, Phone.NUMBER, Photo.PHOTO_ID, Phone.CONTACT_ID };
//
//	/** ��ϵ����ʾ���� **/
//	private static final int PHONES_DISPLAY_NAME_INDEX = 0;
//
//	/** �绰���� **/
//	private static final int PHONES_NUMBER_INDEX = 1;
//
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		mContext = this;
//		/** �õ��ֻ�ͨѶ¼��ϵ����Ϣ **/
//		getPhoneContacts();
//
//		// myAdapter = new MyListAdapter(this);
//		// setListAdapter(myAdapter);
//		//
//		//
//		// mListView.setOnItemClickListener(new OnItemClickListener() {
//		//
//		// @Override
//		// public void onItemClick(AdapterView<?> adapterView, View view,
//		// int position, long id) {
//		// //����ϵͳ��������绰
//		// Intent dialIntent = new Intent(Intent.ACTION_CALL, Uri
//		// .parse("tel:" + mContactsNumber.get(position)));
//		// startActivity(dialIntent);
//		// }
//		// });
//
//		super.onCreate(savedInstanceState);
//	}
//
//	/** �õ��ֻ�ͨѶ¼��ϵ����Ϣ **/
//	private void getPhoneContacts() {
//		ContentResolver resolver = mContext.getContentResolver();
//
//		// ��ȡ�ֻ���ϵ��
//		Cursor phoneCursor = resolver.query(Phone.CONTENT_URI,
//				PHONES_PROJECTION, null, null, null);
//
//		if (phoneCursor != null) {
//			while (phoneCursor.moveToNext()) {
//
//				// �õ��ֻ�����
//				String phoneNumber = phoneCursor.getString(PHONES_NUMBER_INDEX);
//				// ���ֻ�����Ϊ�յĻ���Ϊ���ֶ� ������ǰѭ��
//				if (TextUtils.isEmpty(phoneNumber))
//					continue;
//				Log.v("java", "phoneNumber :" + phoneNumber);
//				// �õ���ϵ������
//				String contactName = phoneCursor
//						.getString(PHONES_DISPLAY_NAME_INDEX);
//				Log.v("java", "contactName" + contactName);
//
//			}
//		}
//	}

}