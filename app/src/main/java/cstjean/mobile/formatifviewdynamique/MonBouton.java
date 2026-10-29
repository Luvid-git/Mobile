package cstjean.mobile.formatifviewdynamique;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MonBouton extends androidx.appcompat.widget.AppCompatButton
        implements View.OnClickListener {

    private Calendar calandar;
    private final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

    public MonBouton(@NonNull Context context) {
        super(context);
        init();
    }

    public MonBouton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        calandar = Calendar.getInstance();
        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), formatter.format(calandar.getTime()), Toast.LENGTH_SHORT).show();
    }
}
