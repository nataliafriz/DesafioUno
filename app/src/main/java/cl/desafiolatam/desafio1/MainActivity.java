package cl.desafiolatam.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    List<Integer> image = new ArrayList<>();
    @BindView(R.id.textView) TextView tvTextView;
    @BindView(R.id.imageViewLeft) ImageView imgLeft;
    @BindView(R.id.imageViewCenter) ImageView imgCenter;
    @BindView(R.id.imageViewRight) ImageView imgRight;
    @BindView(R.id.imageViewResult) ImageView imgResults;


    @OnClick ({R.id.imageViewCenter,R.id.imageViewLeft,R.id.imageViewResult,R.id.imageViewRight})
    void submit() {
        Log.d(TAG,"Pasó por el onClick");
        Collections.shuffle(image);
        imgResults.setImageResource(image.get(0));
        imgResults.setVisibility(tvTextView.VISIBLE);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loadImage();
    }

    private void loadImage() {
        image = new ArrayList<>();
            image.add(R.drawable.ic_gift_beach);
            image.add(R.drawable.ic_gift_music);
            image.add(R.drawable.ic_gift_pizza);
            image.add(R.drawable.ic_bolsas_de_compra);
            image.add(R.drawable.ic_microscopio);
            image.add(R.drawable.ic_pelota);


    }



}
