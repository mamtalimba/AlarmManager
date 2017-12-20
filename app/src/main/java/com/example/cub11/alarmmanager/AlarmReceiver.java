package com.example.cub11.alarmmanager;

/**
 * Created by cub11 on 12/20/2017.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;


public class AlarmReceiver extends BroadcastReceiver {

    Context context;
    private RequestCreator pic;

    @Override
    public void onReceive(Context arg0, Intent arg1) {
        // For our recurring task, we'll just display a message
        context = arg0;
        callAnAPi();
        Toast.makeText(arg0, "I'm running", Toast.LENGTH_SHORT).show();

    }

    private void callAnAPi() {
        String a="https://www.google.co.in/search?q=ganesh&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjZldaurpjYAhXE6Y8KHRg-ChgQ_AUICigB&biw=1366&bih=662#imgrc=wW_0oxmQLgUDWM:";
        pic = Picasso.with(context).load(a);
        Toast.makeText(context, "" + pic.toString(), Toast.LENGTH_SHORT).show();
    }

}

