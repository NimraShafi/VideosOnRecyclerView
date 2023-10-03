package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView1,videoView2,videoView3,videoView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView1 =  findViewById(R.id.vView2);
        videoView2 =  findViewById(R.id.vView3);
        videoView3 =  findViewById(R.id.vView3);
        videoView4 =  findViewById(R.id.vView5);


        /*For Online
        String onlinePath ="https://www.vplayed.com/blog/wp-content/uploads/2023/07/video-streaming-servers-2.mp4";
        Uri uri = Uri.parse(onlinePath);
        videoView .setVideoURI(uri);
        videoView .start();*/


        /* For Local*/

        videoView1.setVideoPath(("android.resource://"+getPackageName()+"/"+R.raw.vedio));
        /*For online and local*/
        MediaController mc2=new MediaController(this);
        mc2.setAnchorView(videoView1);
        videoView1 .setMediaController(mc2);
        mc2.setAnchorView(videoView1);

        videoView2.setVideoPath(("android.resource://"+getPackageName()+"/"+R.raw.vedio1));
        /*For online and local*/
        MediaController mc3=new MediaController(this);
        mc3.setAnchorView(videoView1);
        videoView2 .setMediaController(mc3);
        mc3.setAnchorView(videoView2);


        videoView3.setVideoPath(("android.resource://"+getPackageName()+"/"+R.raw.vedio1));
        /*For online and local*/
        MediaController mc4=new MediaController(this);
        mc4.setAnchorView(videoView1);
        videoView3 .setMediaController(mc4);
        mc4.setAnchorView(videoView3);



        videoView4.setVideoPath(("android.resource://"+getPackageName()+"/"+R.raw.vedio1));
        /*For online and local*/
        MediaController mc5=new MediaController(this);
        mc5.setAnchorView(videoView4);
        videoView4 .setMediaController(mc5);
        mc4.setAnchorView(videoView4);
    }

}