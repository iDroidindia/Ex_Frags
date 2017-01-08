package frags.com.idi.ex_frags;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity implements OnClickListener {

	Button BT_F1,BT_F2, BT_F3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_activity);
		
		BT_F1=(Button)findViewById(R.id.bt_fragment1);
		BT_F2=(Button)findViewById(R.id.bt_fragment2);
		BT_F3=(Button)findViewById(R.id.bt_fragment3);
		
		BT_F1.setOnClickListener(this);
		BT_F2.setOnClickListener(this);
		BT_F3.setOnClickListener(this);
		
		BT_F2.performClick();
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	@Override
	public void onClick(View V) {
		
		// TODO Auto-generated method stub
		switch (V.getId()) {
		
		case R.id.bt_fragment1:
			
			Fragment fragment1=new Fragment1();
			FragmentTransaction fragmentTransaction1 = FirstActivity.this.getFragmentManager()
					.beginTransaction();
			fragmentTransaction1.replace(R.id.fl_content_frame, fragment1);
			fragmentTransaction1.commit();
			break;
			
		case R.id.bt_fragment2:
			Fragment fragment2=new Fragment2();
			FragmentTransaction fragmentTransaction2 = FirstActivity.this.getFragmentManager()
					.beginTransaction();
			fragmentTransaction2.replace(R.id.fl_content_frame, fragment2);
			fragmentTransaction2.commit();		
			break;

		case R.id.bt_fragment3:
			Fragment fragment3=new Fragment3();
			FragmentTransaction fragmentTransaction3 = FirstActivity.this.getFragmentManager()
					.beginTransaction();
			fragmentTransaction3.replace(R.id.fl_content_frame, fragment3);
			fragmentTransaction3.commit();		
			break;


		default:
			break;
		}
	}
}