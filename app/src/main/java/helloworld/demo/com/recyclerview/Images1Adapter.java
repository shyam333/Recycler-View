package helloworld.demo.com.recyclerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shyamramesh on 06/02/18.
 */

public class Images1Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = "ADAPTER";
    private static final int VIEW_TYPE_FIRST = 1;
    private static final int VIEW_TYPE_SECOND = 2;
    private List<Model> modellist = new ArrayList<>();

    private Context mContext;

    public Images1Adapter(Context context) {
        this.mContext = context;


    }

    public void addItem(Bitmap item1,String item2) {

        Model model = new Model();
     if(item2 == null) {
         model.setImage(item1);
         model.settingImage(true);
     }
     else {
         model.setText(item2);
         model.settingString(true);
      //   getItemViewType(VIEW_TYPE_SECOND);
     }

        modellist.add(model);
        notifyDataSetChanged();
    }

//    //
//    public void addItem1(String item) {
//        NewModel newModel = new NewModel();
//        newModel.setText(item);
//        newmodellist.add(newModel);
//       // newmodellist.add(new NewModel (item));
//        notifyDataSetChanged();
//        Log.d(TAG, "TEXT IS ADDED TO MODEL CLASS");
//
//    }

    public int getItemViewType(int position) {

   // Model model = new Model();

    if (modellist.get(position).IfImage() != null) {
            return VIEW_TYPE_FIRST;
        } else {
            return VIEW_TYPE_SECOND;
        }

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder;
        Model model = new Model();
        switch (viewType) {
            case VIEW_TYPE_FIRST:
                View v1 = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
                //  Log.d(TAG, "IMAGE VIEW CREATED");
                model.settingImage(true);
                holder = new Images1Adapter.ViewHolderFirst(v1);
                break;

            case VIEW_TYPE_SECOND:
                View v2 = LayoutInflater.from(mContext).inflate(R.layout.text, parent, false);
                //  Log.d(TAG, "TEXT VIEW CREATED");
                holder = new Images1Adapter.ViewHolderSecond(v2);
                break;
            default:
                v2 = LayoutInflater.from(mContext).inflate(R.layout.text, parent, false);
                holder = new Images1Adapter.ViewHolderSecond(v2);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        switch (holder.getItemViewType())
        {
            case VIEW_TYPE_FIRST:
                        ViewHolderFirst viewHolderFirst = (ViewHolderFirst) holder;
                        configureViewHolder1(viewHolderFirst,position);
                        break;
                    case VIEW_TYPE_SECOND:
                        ViewHolderSecond viewHolderSecond = (ViewHolderSecond) holder;
                        configureViewHolder2(viewHolderSecond,position);
                        break;

        }


    }

    private void configureViewHolder1(ViewHolderFirst viewHolderFirst,int position)
    {
        Model model = modellist.get(position);
        viewHolderFirst.mImageView.setImageBitmap((Bitmap) model.getImage());
    }
    private void configureViewHolder2(ViewHolderSecond viewHolderSecond,int position)
    {
         Model model = modellist.get(position);
        viewHolderSecond.mTextView.setText((String) model.getText());
    }
    @Override
    public int getItemCount() {
        return modellist.size();
    }


    public static class ViewHolderFirst extends RecyclerView.ViewHolder {
        public ImageView mImageView;


        public ViewHolderFirst(View v1) {
            super(v1);
            mImageView = (ImageView) v1.findViewById(R.id.img);
            Log.e(TAG, "FIRST VIEW HOLDER CALLED");
        }
    }

    public static class ViewHolderSecond extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolderSecond(View v2) {
            super(v2);
            mTextView = (TextView) v2.findViewById(R.id.img);
            Log.e(TAG, "SECOND VIEW HOLDER CALLED");
        }
    }
}