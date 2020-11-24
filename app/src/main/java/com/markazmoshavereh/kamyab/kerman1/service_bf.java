package com.markazmoshavereh.kamyab.kerman1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class service_bf extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        showtoast();
        startForeground(100,showNotification("service","در حال بروز رسانی وقت های خالی!"));
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return super.onStartCommand(intent, flags, startId);
    }
  private void showtoast() {
      for (int i = 1; i <= 10; i++)

          new Handler().postDelayed(new Runnable() {
              @Override
              public void run() {
                  Toast.makeText(service_bf.this, "در حال بروز رسانی وقت های خالی!", Toast.LENGTH_SHORT).show();
              }
          }, 4000);
  }
    Notification showNotification(String title, String message) {
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("service",
                    "service chanel",
                    NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription("در حال به روزرسانی وقت های خالی!");
            mNotificationManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), "service")
                .setSmallIcon(R.mipmap.ic_launcher) // notification icon
                .setContentTitle(title) // title for notification
                .setContentText(message)// message for notification
                .setAutoCancel(true); // clear notification after click
        Intent intent = new Intent(getApplicationContext(), service_bf.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(pi);
        return mBuilder.build();
    }
}
