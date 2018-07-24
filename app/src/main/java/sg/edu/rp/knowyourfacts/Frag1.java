package sg.edu.rp.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    Button btnColor;
    TextView tvDisplay;

    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_1, container, false);
        final View view = inflater.inflate(R.layout.fragment_1, container, false);

        tvDisplay = (TextView) view.findViewById(R.id.tvDisplay);
        btnColor = (Button) view.findViewById(R.id.btnColor);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this.setBackgroundColor();
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                view.setBackgroundColor(color);
            }
        });

        return view;
    }

}
