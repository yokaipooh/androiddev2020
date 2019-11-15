package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class fragment extends Fragment {
    public fragment(){};

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState ){
        TextView v = new TextView((getActivity()));
        v.setText("Thursday");
        v.setBackgroundColor(0xF5795E);
        v.setPadding(10,10,10,10);
                return v;
        ImageView icon = new ImageView(getActivity());
        icon.setImageResource(R.drawable.images);
        icon.setScaleType(ImageView.ScaleType.FIT_CENTER);

        RelativeLayout.LayoutParams text_view_param = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        text_view_param.addRule(RelativeLayout.CENTER_IN_PARENT);
        text_view_param.setMargins(0, 15, 0, 15);
        RelativeLayout.LayoutParams image_view_param = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        View view = inflater.inflate(R.layout.fragment, container, false);
        view.setBackgroundColor(0x2000FF00);

        LinearLayout linear_layout1 = view.findViewById(R.id.linearlayout1);
        linear_layout1.setOrientation(LinearLayout.HORIZONTAL);
        linear_layout1.setGravity(Gravity.CENTER);
        linear_layout1.addView(v,text_view_param);
        linear_layout1.addView(icon, image_view_param);
    }
}
