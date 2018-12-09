package xyz.qscftyjm.wordreminder;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.app.Notification;
import android.widget.Button;
import android.widget.Toast;

public class MakeNotificationService extends Service {
    Handler handler = new Handler();
    Runnable runnable;
//    NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//    Notification.Builder builder;
//    Button btICan, btShowAnswer;

    public MakeNotificationService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            NotificationChannel channel = new NotificationChannel("0001", "word", manager.IMPORTANCE_HIGH);
//            if (manager != null) {
//                manager.createNotificationChannel(channel);
//            }
//        }

        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 5000);
//                builder = new NotificationCompat.Builder(MakeNotificationService.this);
//                Intent notificationIntent = new Intent(MakeNotificationService.this, MainActivity.class);
//                notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
//                PendingIntent pendingIntent = PendingIntent.getActivity(MakeNotificationService.this, 0, notificationIntent, 0);
//                builder.setContentTitle("通知标题")//设置通知栏标题
//                        .setContentIntent(pendingIntent) //设置通知栏点击意图
//                        .setContentText("通知内容")
//                        .setTicker("通知内容") //通知首次出现在通知栏，带上升动画效果的
//                        .setWhen(System.currentTimeMillis())//通知产生的时间，会在通知信息里显示，一般是系统获取到的时间
//                        .setSmallIcon(R.mipmap.ic_launcher)//设置通知小ICON
//                        .setChannelId("0001")
//                        .setDefaults(Notification.DEFAULT_ALL);
//
//                Notification notification = builder.build();
//                notification.flags |= Notification.FLAG_AUTO_CANCEL;
//                if (manager != null) {
//                    manager.notify(0x01, notification);
//                }


                Toast.makeText(MakeNotificationService.this, "123", Toast.LENGTH_SHORT).show();
            }
        };

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        runnable.run();

        return super.onStartCommand(intent, flags, startId);
    }

}
