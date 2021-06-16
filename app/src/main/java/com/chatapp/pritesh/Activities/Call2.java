//package com.chatapp.pritesh.Activities;
//
//import android.content.Intent;
//import android.media.AudioManager;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.chatapp.pritesh.R;
//import com.sinch.android.rtc.PushPair;
//import com.sinch.android.rtc.Sinch;
//import com.sinch.android.rtc.SinchClient;
//import com.sinch.android.rtc.SinchError;
//import com.sinch.android.rtc.calling.Call;
//import com.sinch.android.rtc.calling.CallClient;
//import com.sinch.android.rtc.calling.CallClientListener;
//import com.sinch.android.rtc.calling.CallListener;
//
//import java.util.List;
//
//public class Call2 extends AppCompatActivity {
//
//    private static final String APP_KEY = "0e8971ed-5c0b-4eff-a108-592d4f436da4";
//    private static final String APP_SECRET = "PJyJ+rwDQ0Kcv/nV5815yQ==";
//    private static final String ENVIRONMENT = "clientapi.sinch.com";
//
//    private Call call;
//    private TextView callState;
//    private SinchClient sinchClient;
//    private Button button;
//    private String callerId;
//    private String recipientId;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_call2);
//
//
//        Intent intent = getIntent();
//        callerId = intent.getStringExtra("callerId");
//        recipientId = intent.getStringExtra("recipientId");
//
//        sinchClient = Sinch.getSinchClientBuilder()
//                .context(this)
//                .userId(callerId)
//                .applicationKey(APP_KEY)
//                .applicationSecret(APP_SECRET)
//                .environmentHost(ENVIRONMENT)
//                .build();
//
//        sinchClient.setSupportCalling(true);
//        sinchClient.startListeningOnActiveConnection();
//        sinchClient.start();
//
//        sinchClient.getCallClient().addCallClientListener(new SinchCallClientListener());
//
//        button = (Button) findViewById(R.id.button);
//        callState = (TextView) findViewById(R.id.callState);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (call == null) {
//                    call = sinchClient.getCallClient().callUser(recipientId);
//                    call.addCallListener(new SinchCallListener());
//                    button.setText("Hang Up");
//                } else {
//                    call.hangup();
//                }
//            }
//        });
//    }
//
//    private class SinchCallListener implements CallListener {
//        @Override
//        public void onCallEnded(Call endedCall) {
//            call = null;
//            SinchError a = endedCall.getDetails().getError();
//            button.setText("Call");
//            callState.setText("");
//            setVolumeControlStream(AudioManager.USE_DEFAULT_STREAM_TYPE);
//        }
//
//        @Override
//        public void onCallEstablished(Call establishedCall) {
//            callState.setText("connected");
//            setVolumeControlStream(AudioManager.STREAM_VOICE_CALL);
//        }
//
//        @Override
//        public void onCallProgressing(Call progressingCall) {
//            callState.setText("ringing");
//        }
//
//        @Override
//        public void onShouldSendPushNotification(Call call, List<PushPair> pushPairs) {
//        }
//    }
//
//    private class SinchCallClientListener implements CallClientListener {
//        @Override
//        public void onIncomingCall(CallClient callClient, Call incomingCall) {
//            call = incomingCall;
//            Toast.makeText(Call2.this, "incoming call", Toast.LENGTH_SHORT).show();
//            call.answer();
//            call.addCallListener(new SinchCallListener());
//            button.setText("Hang Up");
//        }
//
//
//    }
//
//
//
//}