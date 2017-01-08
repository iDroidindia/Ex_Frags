package frags.com.idi.ex_frags;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LayOutFirst extends Fragment {

    public LayOutFirst()
    {}
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
         ViewGroup root = (ViewGroup) inflater.inflate(R.layout.layout_first, null);
         init(root);
        return root;
    }



    OnButtonPressListener buttonListener;
 
     @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            try {
                buttonListener = (OnButtonPressListener) getActivity();
            } catch (ClassCastException e) {
                throw new ClassCastException(activity.toString() + " Please implement onButtonPressed");
            }
        }
     void init(ViewGroup root){
         Button but=(Button)root.findViewById(R.id.bt_send);
         but.setOnClickListener(new View.OnClickListener() {
 
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                buttonListener.onButtonPressed("A message is send From Fragment 1 to Fragment 2.");
            }
        });
     }
}