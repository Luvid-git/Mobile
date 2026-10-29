package cstjean.mobile.exampleViewDyn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MonBouton extends androidx.appcompat.widget.AppCompatButton implements View.OnClickListener {
    public MonBouton(Context context) {
        super(context);
        setOnClickListener(this);
    }

    //deuxieme constructer pour definir le click listener
    public MonBouton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
// ...
    }


}
