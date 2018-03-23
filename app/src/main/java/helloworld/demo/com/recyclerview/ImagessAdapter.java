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
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by shyamramesh on 04/02/18.
// */
//
//public class ImagessAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//    private static final String TAG = "ADAPTER";
//    private static final int VIEW_TYPE_FIRST = 1;
//    private static final int VIEW_TYPE_SECOND = 2;
//    private List<Bitmap> modellist1 = new ArrayList<>();
//    private List<String> modellist2 = new ArrayList<>();
//    private Context mContext;
//
//    public ImagessAdapter(Context context) {
//        this.mContext = context;
//    }
//
//    public void addItem(Bitmap item) {
//        //  Model model = new Model();
//        //  modellist.put(1,item);
//        modellist1.add(item);
//        //  model.setImage(new Model(item));
//        //   modellist.add(new Model(item));
//        // modellist.add(model.setImage(item));
//        //   modellist.add(model.setImage(item));
//        notifyDataSetChanged();
////        modellist.set(item);
////        mImages.add(item);
////        notifyDataSetChanged();   n
//        Log.d(TAG, "IMAGE IS ADDED TO MODEL CLASS");
//        // getItemViewType(1);
//    }
//
//    public void addItem1(String item) {
//        modellist2.add(item);
//        notifyDataSetChanged();
//    }
//
//
//    @Override
//    public int getItemViewType(int position) {
////
//            if(modellist1.get(position) instanceof Bitmap) {
//                Log.d(TAG, "GETTING IMAGE VIEW TYPE");
//                return VIEW_TYPE_FIRST;
//            }
////        switch (position) {
////            case VIEW_TYPE_SECOND:
//            else if (modellist2.get(position) instanceof String) {
//                Log.d(TAG, "GETTING TEXT VIEW TYPE");
//                return VIEW_TYPE_SECOND;
////            }
////
//         }
////    if (position == VIEW_TYPE_FIRST) {
////        //   return mImages.size();
////
////        //return modellist.get(position);
////        // return model.getImage();
////        // model.setImage(model.getImage());
////        return modellist1.size();
////
////    } else if (position == VIEW_TYPE_SECOND) {
////        // return mDataSet.size();
////        //  holder.mTextView.setText(model.getText());
////        //  model.setText(model.getText());
////        Log.e(TAG, "TEXT GET ITEM VIEW TYPE RETURNED");
////        return modellist2.size();
////    }
//        //return -1;
//        return super.getItemViewType(position);
//    }
//
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        RecyclerView.ViewHolder holder;
//        switch (viewType) {
//            case VIEW_TYPE_FIRST:
//                View v1 = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
//              //  Log.d(TAG, "IMAGE VIEW CREATED");
//                holder = new ViewHolderFirst(v1);
//                break;
//
//            case VIEW_TYPE_SECOND:
//                View v2 = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
//              //  Log.d(TAG, "TEXT VIEW CREATED");
//                holder = new ViewHolderSecond(v2);
//                break;
//            default:
//                v2 = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
//                holder = new ViewHolderSecond(v2);
//                break;
//        }
//        return holder;
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//
//        int type = holder.getItemViewType();
//        if (type == VIEW_TYPE_FIRST) {
//            ViewHolderFirst viewHolderFirst = (ViewHolderFirst) holder;
//            viewHolderFirst.mImageView.setImageBitmap((Bitmap) modellist1.get(position));
//         //   viewHolderFirst.mImageView.setImageBitmap(model.getImage());
//            Log.d(TAG, "IMAGE BINDED");
//        } else if (type == VIEW_TYPE_SECOND) {
//            //  viewHolderFirst.mImageView.setImageBitmap((Bitmap) model.getImage());
//            //   viewHolderFirst.mImageView.setImageBitmap((Bitmap)modellist.get(model.getImage()));
//            ViewHolderSecond viewHolderSecond = (ViewHolderSecond) holder;
//            viewHolderSecond.mTextView.setText((String) modellist2.get(position));
//            Log.d(TAG, "TEXT BINDED");
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        Log.d(TAG, "ITEM COUNT RETURNED");
//        return modellist1.size() + modellist2.size();
//
//    }
//
//
//    public static class ViewHolderFirst extends RecyclerView.ViewHolder {
//        public ImageView mImageView;
//
//        public ViewHolderFirst(View v1) {
//            super(v1);
//            mImageView = (ImageView) v1.findViewById(R.id.img);
//            Log.e(TAG, "VIEW HOLDER CALLED");
//        }
//    }
//
//    public static class ViewHolderSecond extends RecyclerView.ViewHolder {
//        public TextView mTextView;
//
//        public ViewHolderSecond(View v2) {
//            super(v2);
//            mTextView = (TextView) v2.findViewById(R.id.txt);
//            Log.e(TAG, "VIEW HOLDER CALLED");
//        }
//    }
//}
