package spotsoon.com.demoappspotsoon.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import spotsoon.com.demoappspotsoon.R;

/**
 * Created by Bmsils on 5/4/2017.
 */

public class MenuItemsViewHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.itemRowOfMenuItems)
    public LinearLayout rowViewItemMenus;

    @BindView(R.id.itemRowOfMenuItemsIconImageView)
    public ImageView itemRowOfMenuItemsImageView;

    @BindView(R.id.itemRowOfMenuItemsNameTextView)
    public TextView itemRowOfMenuItemsTextView;

    public MenuItemsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);


    }
}
