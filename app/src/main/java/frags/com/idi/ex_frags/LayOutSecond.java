package frags.com.idi.ex_frags;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LayOutSecond  extends Fragment {
	
    ViewGroup root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        root = (ViewGroup) inflater.inflate(R.layout.layout_second, null);
        return root;
        
    }
    void setMessage(String msg){
        TextView txt=(TextView)root.findViewById(R.id.tv_txt);
        txt.setText(msg);
    }
}