//package helloworld.demo.com.recyclerview;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
///**
// * Created by shyamramesh on 03/02/18.
// */
//
//public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder>{
//    private static final String TAG = "ADAPTER";
//    private List<Model> modellist;
//    private Context mContext;
//
//    public ImageAdapter(Context mContext,List<Model>modellist) {
//        this.mContext = mContext;
//        this.modellist = modellist;
//    }
//
//    public void addItem(Bitmap item) {
//        Model model = new Model();
//        model.setImage(item);
//        notifyDataSetChanged();
//        Log.d(TAG,"IMAGE ADDED");
//    }
//
//    public void addItem1(String item) {
//        Model model = new Model();
//        model.setText(item);
//        notifyDataSetChanged();
//        Log.d(TAG,"TEXT ADDED");
//    }
//
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        // Create a new View
//        LayoutInflater inflater = LayoutInflater.from(mContext);
//        View view = inflater.inflate(R.layout.images, null);
//        Log.d(TAG,"LAYOUT INFLATED");
//        return new ViewHolder(view);
//
//    }
//
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, final int position) {
//        Model model = modellist.get(position);
//        holder.mTextView.setText(model.getText());
//        Log.d(TAG,"TEXT BINDED");
//        holder.mImageView.setImageBitmap(model.getImage());
//        Log.d(TAG,"IMAGE BINDED");
//
//    }
//
//    @Override
//    public int getItemCount() {
//      //  return null!=modellist?modellist.size():0;
//       Log.d(TAG,"ITEM COUNT RETURNED");
//       // return null!=modellist?modellist.size():0;
//        return modellist.size();
//
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder
//    {
//        public TextView mTextView;
//        public ImageView mImageView;
//
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            mTextView = (TextView) itemView.findViewById(R.id.txt);
//            mImageView = (ImageView) itemView.findViewById(R.id.img);
//
//        }
//    }
//}
