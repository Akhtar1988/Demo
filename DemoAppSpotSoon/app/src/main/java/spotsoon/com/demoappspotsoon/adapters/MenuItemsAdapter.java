package spotsoon.com.demoappspotsoon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import spotsoon.com.demoappspotsoon.R;
import spotsoon.com.demoappspotsoon.holders.MenuItemsViewHolder;

/**
 * Created by Akhtar
 */

public class MenuItemsAdapter extends RecyclerView.Adapter<MenuItemsViewHolder>{

    private Context mContext;
    String[] menuItemsName;
    int[] menuItemsImgs;
    LayoutInflater layoutInflater;

    public MenuItemsAdapter(Context mContext, String[] menuItemsName, int[] menuItemsImgs) {
        this.mContext = mContext;
        this.layoutInflater = LayoutInflater.from(mContext);
        this.menuItemsName = menuItemsName;
        this.menuItemsImgs = menuItemsImgs;
    }

    @Override
    public MenuItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_row_menu_items, parent, false);
        return new MenuItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuItemsViewHolder holder, int position) {
        holder.itemRowOfMenuItemsTextView.setText(menuItemsName[position]);
        holder.itemRowOfMenuItemsImageView.setImageResource(menuItemsImgs[position]);


    }

    @Override
    public int getItemCount() {
        return menuItemsName.length;
    }
}
