package com.markazmoshavereh.kamyab.kerman1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class broadcast_reciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "broadcast test", Toast.LENGTH_SHORT).show();
    }
}
