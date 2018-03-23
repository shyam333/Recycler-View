//package helloworld.demo.com.recyclerview;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by shyamramesh on 07/02/18.
// */
//
//public class Images2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//    private static final String TAG = "ADAPTER";
//    private List<Model> modellist = new ArrayList<>();
//    private static final int VIEW_TYPE_FIRST = 1;
//    private static final int VIEW_TYPE_SECOND = 2;
//    private Context mContext;
//
//    public Images1Adapter(Context context) {
//        this.mContext = context;
//
//
//    }
//    public void addItem(Bitmap item1, String item2) {
//
//        Model model = new Model();
//        if(item2 == null) {
//            model.setImage(item1);
//            model.settingImage(true);
//        }
//        else {
//            model.setText(item2);
//            model.settingString(true);
//            //   getItemViewType(VIEW_TYPE_SECOND);
//        }
//
//        modellist.add(model);
//        notifyDataSetChanged();
//    }
//
//    public int getItemViewType(int position) {
//
//        // Model model = new Model();
//
//        if (modellist.get(position).IfImage()) {
//            return VIEW_TYPE_FIRST;
//        } else {
//            return VIEW_TYPE_SECOND;
//        }
//
//    }
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        RecyclerView.ViewHolder holder;
//        switch (viewType) {
//            case VIEW_TYPE_FIRST:
//                View v1 = LayoutInflater.from(mContext).inflate(R.layout.images, parent, false);
//                //  Log.d(TAG, "IMAGE VIEW CREATED");
//                holder = new Images1Adapter.ViewHolderFirst(v1);
//                break;
//
//            case VIEW_TYPE_SECOND:
//                View v2 = LayoutInflater.from(mContext).inflate(R.layout.text, parent, false);
//                //  Log.d(TAG, "TEXT VIEW CREATED");
//                holder = new Images1Adapter.ViewHolderSecond(v2);
//                break;
//            default:
//                v2 = LayoutInflater.from(mContext).inflate(R.layout.text, parent, false);
//                holder = new Images1Adapter.ViewHolderSecond(v2);
//                break;
//        }
//        return holder;
//    }
//
//
//
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//}
