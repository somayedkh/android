package com.example.somaye.todoapp;

/**
 * Created by somaye on 10-1-2018.
 */
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "FCM Service";
    @Override
        public void onMessageReceived(RemoteMessage remoteMessage) {
            // TODO: Handle FCM messages here.
            Log.d(TAG, "Form: " + remoteMessage.getFrom());
            Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());
        }
}
