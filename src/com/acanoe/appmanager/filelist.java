package com.acanoe.appmanager;


import java.io.File;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class filelist extends Activity
{ /* ����������� */
  private Button mButton;
  private EditText mKeyword;
  private TextView mResult;
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
//    super.onCreate(savedInstanceState); /* ����main.xml Layout */
//    setContentView(R.layout.main); /* ��ʼ������ */
//    mKeyword = (EditText) findViewById(R.id.mKeyword);
//    mButton = (Button) findViewById(R.id.mButton);
//    mResult = (TextView) findViewById(R.id.mResult); /* ��mButton����onClickListener */
//    mButton.setOnClickListener(new Button.OnClickListener()
//    {
//      public void onClick(View v)
//      { /* ȡ������Ĺؼ��� */
//        String keyword = mKeyword.getText().toString();
//        if (keyword.equals(""))
//        {
//          mResult.setText("��������հ׵Ĺؼ���!!");
//        } else
//        {
//          mResult.setText(searchFile(keyword));
//        }
//      }
//    });
  } /* �����ļ���method */
  
  
//  private static String searchFile(String keyword)
static  void searchFile(String keyword)
  {
    String result = "";
    /*File f = new File("/")ָ�ڵ�ǰ�̷�·����*/
    /*listFiles()���԰�Ŀ¼������ļ�����Ŀ¼�������*/
    File[] files = new File("/").listFiles();
    
    
    
    for (File f : files)
    {
    	
    	Log.d("java","" + f.getPath());
      /*//�ж��ļ���f���Ƿ����keyword
      if (f.getName().indexOf(keyword) >= 0)
      {
        //f.getPath()�����ļ���·��
        result += f.getPath() + "/n";
      }*/
    }
//    if (result.equals(""))
//      result = "�Ҳ����ļ�!!";
//    return result;
  }
}