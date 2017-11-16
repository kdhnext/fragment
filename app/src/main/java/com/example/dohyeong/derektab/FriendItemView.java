package com.example.dohyeong.derektab;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Dohyeong on 2017-11-13.
 */

public class FriendItemView extends LinearLayout {

    TextView name;
    TextView mobile;

    public FriendItemView(Context context) {
        super(context);
        init(context);
    }

    public FriendItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.friend_item, this, true);

        name = (TextView) findViewById(R.id.name);
        mobile = (TextView) findViewById(R.id.mobile);
    }

    public void setName(String namee) {
        name.setText(namee);
    }
    public void setMobile(String mobilee) {
        mobile.setText(mobilee);
    }
}
