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
// * Created by shyamramesh on 31/01/18.
// */
//
//public class ImagesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//
//    private static final String TAG = "ADAPTER";
//    //  private static final int type = 0;
//    private static final int VIEW_TYPE_FIRST = 1;
//    private static final int VIEW_TYPE_SECOND = 2;
//    //   private static final int VIEW_TYPE_DEFAULT = 3;
//    private List<Model> modellist = new ArrayList<>();
//    //    private ArrayList<Bitmap> mImages = new ArrayList<Bitmap>();
////    private ArrayList<String> mDataSet = new ArrayList<String>();
//
//    private Context mContext;
//
//
////    public ImagesAdapter(Context mContext,ArrayList<Bitmap> mImages,ArrayList<String> mDataSet) {
////        this.mContext = mContext;
//////        this.mImages = mImages;
//////        this.mDataSet = mDataSet;
////    }
//
//    public ImagesAdapter(Context context) {
//        this.mContext = context;
//
//    }
//
//    public void addItem(Bitmap item) {
//        //  Model model = new Model();
//        //  model.setImage(item);
//        Model model = new Model(item);
//       // modellist.add(new Model(item));
//          model.setImage(item);
//
//
//        notifyDataSetChanged();
//        Log.d(TAG, "IMAGE IS ADDED TO MODEL CLASS");
//
//    }
//
//    //
//    public void addItem1(String item) {
//        //  Model model = new Model();
//        // model.setText(item);
//        Model model = new Model(item);
//       // modellist.add(new Model(item));
//         model.setText(item);
//        notifyDataSetChanged();
//        Log.d(TAG, "TEXT IS ADDED TO MODEL CLASS");
//
//    }
//
//
//    @Override
//    public int getItemViewType(int position) {
////if(position == VIEW_TYPE_FIRST)
////{
////    return R.layout.images;
////
////}
////else {
////    return R.layout.text;
////}
//
//
//        //  Model model = new Model(Bitmap);
//
//     //   VIEW_TYPE_FIRST = bitmap;
//            if(VIEW_TYPE_FIRST == 1) {
//                 modellist.get(position).getImage();
//                return VIEW_TYPE_FIRST;
//            }
//            if(VIEW_TYPE_SECOND == 2)
//            {
//                modellist.get(position).getText();
//                return VIEW_TYPE_SECOND;
//
//        }
//
//
////        if (VIEW_TYPE_FIRST == 1) {
////            if (modellist.get(position).getBitMapValue()) {
////
////                return VIEW_TYPE_FIRST;
////            }
////        } else if (VIEW_TYPE_SECOND == 2) {
////            if (modellist.get(position).getTextValue()) {
////                return VIEW_TYPE_SECOND;
////            }
////        }
//
////        if (modellist.get(position) instanceof Model) {
////            Log.d(TAG, "GETTING IMAGE VIEW TYPE");
////
////        }
////        if(modellist.get(position).getImage())
////        {
////            return VIEW_TYPE_FIRST;
////        }
////        if(position == VIEW_TYPE_FIRST)
////        {
////            return Integer.parseInt(String.valueOf(modellist.get(position).getImage()));
////        }
////        else if(position == VIEW_TYPE_SECOND)
////        {
////            return Integer.parseInt(modellist.get(position).getText());
////        }
//        //  Model model = new Model();
//        //  if(modellist.get(position).getImage())
////        if (modellist.get(position)instanceof Model)
////        {
////            Log.d(TAG, "IMAGE VIEW TYPE RETURNED");
////            return VIEW_TYPE_FIRST;
////
////        }
////        else if(modellist.get(position)instanceof Model){
////               return VIEW_TYPE_SECOND;
////           }
////        else if(position == VIEW_TYPE_SECOND)
////        {
////            modellist.get(position).getText();
////            Log.d(TAG,"TEXT VIEW TYPE RETURNED");
//
//        return super.getItemViewType(position);
//    }
//////
////    @Override
////    public int getItemViewType(int position) {
////        // if (mImages.get(position)instanceof ) {
////        Model model = modellist.get(position);
////        if (position == VIEW_TYPE_FIRST) {
////            //   return mImages.size();
////
////            //return modellist.get(position);
////            // return model.getImage();
////            model.setImage(model.getImage());
////
////            Log.e(TAG, "IMAGE GET ITEM VIEW TYPE RETURNED");
////
////        } else if (position == VIEW_TYPE_SECOND) {
////            // return mDataSet.size();
////            //  holder.mTextView.setText(model.getText());
////            model.setText(model.getText());
////            Log.e(TAG, "TEXT GET ITEM VIEW TYPE RETURNED");
////            //return mDataSet.size();
////        }
//////        else (position == VIEW_TYPE_DEFAULT)
//////        {
//////            return;
//////        }
////        return super.getItemViewType(position);
////        //  return position % 2 * 2;
////    }
//
//
////        if(position == 1)
////        {
////            return VIEW_TYPE_FIRST;
////        }
////        else if(position == 2)
////        {
////            return VIEW_TYPE_SECOND;
////        }
////        //   return -1;
////         return position % 2 * 2;
//    // return position -1;
//
//
////      //  if (itemType == 0) {
////            viewHolderFirst = (ViewHolderFirst) holder;
////      //  }else {
////            viewHolderSecond = (ViewHolderSecond) holder;
////      //  }
//
//
////            View v3 = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
////            Log.d(TAG, "DEFAULT VIEW CREATED");
////            Log.d(TAG, "VIEW HOLDER DEFAULT CALLED");
////            return new ViewHolderDefault(v3);
//
////        if (viewType == 0) {
////
////            Log.d(TAG,"IMAGE VIEW CREATED");
////            return new MultipleViewHolder(LayoutInflater.from(mContext).inflate(R.layout.images, parent, false));
////
////        } else {
////            Log.d(TAG,"TEXT VIEW CREATED");
////            return new MultipleViewHolder(LayoutInflater.from(mContext).inflate(R.layout.text, parent, false));
////
////        }
//    // }
//
////        View v;
////        ViewHolder vh;
////        switch (viewType) {
////            case 0:
////                v = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
////                vh = new ViewHolder(v, viewType);
////                return vh;
////            case 1:
////                v = LayoutInflater.from(mContext).inflate(R.layout.text, parent, false);
////                vh = new ViewHolder(v, viewType);
////                return vh;
////
////        }
////        return null;
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        RecyclerView.ViewHolder holder;
//        switch (viewType) {
//            case VIEW_TYPE_FIRST:
//                View v1 = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
//                //  Log.d(TAG, "IMAGE VIEW CREATED");
//                holder = new ViewHolderFirst(v1);
//                break;
//
//            case VIEW_TYPE_SECOND:
//                View v2 = LayoutInflater.from(mContext).inflate(R.layout.text, parent, false);
//                //  Log.d(TAG, "TEXT VIEW CREATED");
//                holder = new ViewHolderSecond(v2);
//                break;
//            default:
//                v2 = LayoutInflater.from(mContext).inflate(R.layout.text, parent, false);
//                holder = new ViewHolderSecond(v2);
//                break;
//        }
//        return holder;
//
//
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//          int type = holder.getItemViewType();
//          Model model = modellist.get(position);
//         if (type == VIEW_TYPE_FIRST) {
//            ViewHolderFirst viewHolderFirst = (ViewHolderFirst) holder;
//            // viewHolderFirst.mImageView.setImageBitmap((Bitmap) modellist.get(position));
//            viewHolderFirst.mImageView.setImageBitmap((Bitmap) model.getImage());
//
//            Log.d(TAG, "IMAGE BINDED");
//         } else if (type == VIEW_TYPE_SECOND) {
//            ViewHolderSecond viewHolderSecond = (ViewHolderSecond) holder;
//            //  viewHolderSecond.mTextView.setText((String) modellist.get(position));
//            viewHolderSecond.mTextView.setText((String) model.getText());
//            Log.d(TAG, "TEXT BINDED");
//          }
////        else (type == VIEW_TYPE_DEFAULT) {
////            ViewHolderDefault viewHolderDefault = (ViewHolderDefault) holder;
////            //  viewHolderSecond.mTextView.setText((String) modellist.get(position));
////            //viewHolderDefault.mRelativeLayout.setText((String)model.getText());
////            Log.d(TAG, "TEXT BINDED");
////        }
//        // }
////        }
////        switch (getItemViewType(position)) {
////            case VIEW_TYPE_FIRST:
////                ViewHolderFirst viewHolderFirst = (ViewHolderFirst) holder;
////             //   holder.mImageView.setImageBitmap((Bitmap) mImages.get(position));
////               viewHolderFirst.mImageView.setImageBitmap((Bitmap)mImages.get(position));
////                getItemViewType(1);
////             // ((ViewHolderFirst) holder).mImageView.setImageBitmap((Bitmap)mImages.get(position));
////                Log.d(TAG,"IMAGE BINDED");
////                break;
////            case VIEW_TYPE_SECOND:
////                ViewHolderSecond viewHolderSecond = (ViewHolderSecond) holder;
////               // holder.mTextView.setText((String) mDataSet.get(position));
////                viewHolderSecond.mTextView.setText((String)mDataSet.get(position));
////                getItemViewType(2);
////               // ((ViewHolderSecond) holder).mTextView.setText((String)mDataSet.get(position));
////                Log.d(TAG,"TEXT BINDED");
////                break;
////        }
////        if(getItemViewType(position) == 0)
////        {
////            holder.imageView.setImageBitmap((Bitmap) mImages.get(position));
////
////            Log.d(TAG,"IMAGE VIEW BINDED");
////        }
////        else {
////            holder.textView.setText((String) mDataSet.get(position));
////
////            Log.d(TAG,"TEXT VIEW BINDED");
////        }
////    }swsw
//
//    }
//
//    @Override
//    public int getItemCount() {
//        Log.e(TAG, "ITEMCOUNT RETURNED");
//        return modellist.size();
//        //    return null!=modellist?modellist.size(): null !=modellist?modellist.size():0;
//        //  return mImages.size()+mDataSet.size() ;
//        //  return mDataSet.size();
//    }
//
////    public static class ViewHolderFirst extends RecyclerView.ViewHolder {
////        public ImageView mImageView;
////      //  public RelativeLayout mRelativeLayout;
////
////        public ViewHolderFirst(View v1) {
////            super(v1);
////            mImageView = (ImageView) v1.findViewById(R.id.img);
////          //  mRelativeLayout = (RelativeLayout) v.findViewById(R.id.rl);
////        }
////    }
////
////    // View v = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
////    //  View v = LayoutInflater.from(mContext).inflate(R.layout.text, parent, false);
////    // return new ViewHolder(v);
//////        switch(viewType)
//////        {
//////            case 0: return new ViewHolder0(...);
//////            case 2: return new ViewHolder2(...);
//////        }
////    public static class ViewHolderSecond extends RecyclerView.ViewHolder {
////        public TextView mTextView;
////        //public RelativeLayout mRelativeLayout;
////
////        public ViewHolderSecond(View v2) {
////            super(v2);
////            mTextView = (TextView) v2.findViewById(R.id.txt);
////          //  mRelativeLayout = (RelativeLayout) v.findViewById(R.id.rl);
////        }
////    }
//
//
//    //        int viewType = 1;
////        if (position == 0) {
////            viewType = 0;
////        }
////        return viewType;
//    // Just as an example, return 0 or 2 depending on position
//    // Note that unlike in ListView adapters, types don't have to be contiguous
////        return position % 2 * 2;
//    public static class ViewHolderFirst extends RecyclerView.ViewHolder {
//        public ImageView mImageView;
//
//        public ViewHolderFirst(View v1) {
//            super(v1);
//            mImageView = (ImageView) v1.findViewById(R.id.img);
//            Log.e(TAG, "FIRST VIEW HOLDER CALLED");
//        }
//    }
//
//    public static class ViewHolderSecond extends RecyclerView.ViewHolder {
//        public TextView mTextView;
//
//        public ViewHolderSecond(View v2) {
//            super(v2);
//            mTextView = (TextView) v2.findViewById(R.id.txt1);
//            Log.e(TAG, "SECOND VIEW HOLDER CALLED");
//        }
//    }
////    public static class ViewHolderDefault extends RecyclerView.ViewHolder {
////        public RelativeLayout mRelativeLayout;
////        public ViewHolderDefault(View v3) {
////            super(v3);
////            mRelativeLayout = (RelativeLayout) v3.findViewById(R.id.rl);
////        }
////    }
//
//}
