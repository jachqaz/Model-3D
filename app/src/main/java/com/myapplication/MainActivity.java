package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    BasicRenderer renderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ItemVo items = new ItemVo("Load model from .3ds file", ExampleLoad3DSFile.class, "ExampleLoad3DSFile.java");
        this.startActivity(new Intent(this, items.cls));
//        final SurfaceView surface = new SurfaceView(this);
//        surface.setFrameRate(60.0);
//        surface.setRenderMode(ISurface.RENDERMODE_WHEN_DIRTY);
//
//        // Add mSurface to your root view
//        addContentView(surface, new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT));
//
//        renderer = new BasicRenderer(this);
//        surface.setSurfaceRenderer(renderer);
    }

    class ItemVo {
        public String filename;
        public Class<?> cls;
        public String label;

        public ItemVo(String $label, Class<?> $class, String $filename) {
            label = $label;
            cls = $class;
            filename = $filename;
        }
    }
}
