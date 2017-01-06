package com.hzj.eventcollection.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hzj.eventcollection.R;


/**
 * 消息记录主界面通知图标
 * <p>
 * Created by hzj on 2016/11/25.
 */
public class MessageRemindView extends RelativeLayout implements View.OnClickListener {

    private static final String TAG = "MessageRemindView";

    private ImageView icon;

    public MessageRemindView(Context context) {
        super(context);
        init(context);
    }

    public MessageRemindView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.message_remind_view, this, true);
        icon = (ImageView) findViewById(R.id.iv_message_remind_icon);
        icon.setOnClickListener(this);
    }

    private void enterMessageCenter() {
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_message_remind_icon:
                enterMessageCenter();
                break;
            default:
                break;
        }
    }

}
