package xyz.qscftyjm.listAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import xyz.qscftyjm.wordreminder.R;;
import java.util.ArrayList;
import java.util.Map;

public class MainListAdapter extends BaseAdapter {

    ArrayList<Map<String, Object>> dataArray;
    Context context;
    ViewHolder viewHolder;

    public MainListAdapter(Context context, ArrayList<Map<String, Object>> dataArray) {
        this.context=context;
        this.dataArray=dataArray;
    }
    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return dataArray.size();
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return position;
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param view The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {

            view = LayoutInflater.from(context).inflate(R.layout.list_item_userinfo_layout, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tv_time.setText(dataArray.get(position).get("time").toString());
        viewHolder.tv_msg.setText(dataArray.get(position).get("content").toString());
        viewHolder.tv_account.setText(dataArray.get(position).get("account").toString());
        viewHolder.tv_username.setText(dataArray.get(position).get("username").toString());

        return view;
    }

    class ViewHolder {
        TextView tv_msg;
        TextView tv_time;
        TextView tv_account;
        TextView tv_username;

        public ViewHolder(View view) {

        }


    }
}
