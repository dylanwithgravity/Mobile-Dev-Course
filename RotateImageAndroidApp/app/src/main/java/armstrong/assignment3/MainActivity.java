package armstrong.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    ImageView imgview;
    Switch rotate;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgview = (ImageView)findViewById(R.id.imageView);
        rotate = (Switch)findViewById(R.id.switch1);
        rotate.setChecked(true);
        rotate.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotation);
                if (bChecked) {
                    imgview.startAnimation(anim);
                }else {
                    imgview.clearAnimation();
                }


            }
        });




    }


}
