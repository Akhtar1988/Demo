package spotsoon.com.demoappspotsoon.viewpager;





import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import spotsoon.com.demoappspotsoon.fragments.ImagesFragment;
import spotsoon.com.demoappspotsoon.fragments.MilesToneFragment;
import spotsoon.com.demoappspotsoon.fragments.VideoFragment;

/**
 * Created by Akhtar
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public ViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                VideoFragment tab1 = new VideoFragment();
                return tab1;

            case 1:
                ImagesFragment tab2 = new ImagesFragment();
                return tab2;
            case 2:
                MilesToneFragment tab3 = new MilesToneFragment();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
