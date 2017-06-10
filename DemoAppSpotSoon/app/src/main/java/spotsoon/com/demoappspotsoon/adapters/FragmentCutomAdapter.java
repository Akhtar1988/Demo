package spotsoon.com.demoappspotsoon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import spotsoon.com.demoappspotsoon.R;
import spotsoon.com.demoappspotsoon.holders.FragmentHolders;


/**
 * Created by Akhtar
 */

public class FragmentCutomAdapter extends RecyclerView.Adapter<FragmentHolders> {

    Context context;
    LayoutInflater layoutInflater;
    int[] data;
    public FragmentCutomAdapter( Context context , int[] data){

        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;


    }
    @Override
    public FragmentHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new FragmentHolders(view);
    }

    @Override
    public void onBindViewHolder(FragmentHolders holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
