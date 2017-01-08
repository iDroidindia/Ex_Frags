package frags.com.idi.ex_frags;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements OnButtonPressListener{
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_layout);
    }
 
    @Override
    public void onButtonPressed(String msg) {
        // TODO Auto-generated method stub
         LayOutSecond LS_Obj=(LayOutSecond) getSupportFragmentManager().findFragmentById(R.id.ff_bottom);
         LS_Obj.setMessage(msg);
    }
 
}