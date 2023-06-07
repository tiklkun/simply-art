package com.example.simplyart.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAANHBwMlg:APA91bHz2L8nzfnX6Vu6cQ-F7qSJ1hcYyCDIthPbrpjlvgYxu-ig1QNxsvPoOa7NysHfnk6SIoLPzwRhpzTm1X217-2LmkYdvDSep6g1QrsquDgrhkZ5XSnkERteECo70rkBttUMoLap"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
