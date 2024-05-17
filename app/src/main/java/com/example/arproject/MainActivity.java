package com.example.arproject;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;

import com.google.ar.core.Anchor;
import com.google.ar.core.Config;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.core.Session;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.ArSceneView;
import com.google.ar.sceneform.Node;
import com.google.ar.sceneform.SceneView;
import com.google.ar.sceneform.Sceneform;
import com.google.ar.sceneform.math.Vector3;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.rendering.Renderable;
import com.google.ar.sceneform.rendering.ViewRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.BaseArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity
{
    private Button trong, non, nha;
    private TextView textView;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        trong = findViewById(R.id.trongdong);
        nha = findViewById(R.id.nhasan);
        non = findViewById(R.id.nonla);
        nha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), startAr.class);
                intent.putExtra("url", "https://firebasestorage.googleapis.com/v0/b/network-c34fb.appspot.com/o/nha.glb?alt=media&token=f80ecb4f-1577-4965-97ea-33a2f37c5166");
                view.getContext().startActivity(intent);
            }
        });

        trong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), startAr.class);
                intent.putExtra("url", "https://firebasestorage.googleapis.com/v0/b/network-c34fb.appspot.com/o/Trong.glb?alt=media&token=a089709b-3fce-4f7e-acd7-7375fbf69256");
                view.getContext().startActivity(intent);
            }
        });

        non.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), startAr.class);
                intent.putExtra("url", "https://firebasestorage.googleapis.com/v0/b/network-c34fb.appspot.com/o/non.glb?alt=media&token=c61cdd8e-7c03-4bf9-8952-41088602849d");
                view.getContext().startActivity(intent);
            }
        });
        
    }
}
