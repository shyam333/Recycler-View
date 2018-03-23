package helloworld.demo.com.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RelativeLayout mRelativeLayout;
    LinearLayoutManager linearLayoutManager;
    private Context mContext;
    private RecyclerView mRecyclerView;
    private Button mButtonAdd;
    private Button txtadd;
    private Images1Adapter mAdapter;
    private static final String TAG = "MAIN ACTIVITY";
    private EditText edttxt;
  //  private ArrayList<Bitmap> mImages = new ArrayList<Bitmap>();
  //  private ArrayList<String> mDataSet = new ArrayList<String>();
  //  private List<Model> modelist = new ArrayList<>();


    private int PICK_IMAGE_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();


        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);
        mButtonAdd = (Button) findViewById(R.id.btn);
        txtadd = (Button) findViewById(R.id.btn2);
        edttxt = (EditText) findViewById(R.id.edt);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mAdapter = new Images1Adapter(mContext);
     //   mAdapter = new ImagessAdapter(this,modelist);
        mRecyclerView.setAdapter(mAdapter);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true);


        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        mRecyclerView.setItemAnimator(itemAnimator);


      //  modelList = new ArrayList<>();

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);

            }
        });

        txtadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {

                String txt = edttxt.getText().toString();
                if (txt.length() != 0) {
                   mAdapter.addItem(null,txt);
                   Log.d(TAG,"TEXT ITEM SELECTED");

                }
                edttxt.getText().clear();
               // edttxt.setText("");

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri uri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);

                mAdapter.addItem(bitmap,null);

                Log.d(TAG,"IMAGE ITEM SELECTED");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}

