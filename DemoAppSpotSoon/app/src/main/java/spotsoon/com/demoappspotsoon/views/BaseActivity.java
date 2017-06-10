package spotsoon.com.demoappspotsoon.views;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

import spotsoon.com.demoappspotsoon.R;
import spotsoon.com.demoappspotsoon.adapters.MenuItemsAdapter;

// Create By Akhtar
public class BaseActivity extends AppCompatActivity {

    protected DrawerLayout mDrawer;
    protected NavigationView navigationView;
    public static TextView mNavUsername;
    public static TextView mNavUserEmailId;
    RecyclerView menuItemsRecyclerView;

    String[] menuItems = {"MY PROFILE", "NOTIFICATIONS",
            "FAQs", "BLOOD DONATION", "INVITE FRIENDS","HELP",
            "CONTACT", "CHANGE PASSWORD", "LOGOUT"};
    int[] menuItemImgs = {R.drawable.select_video, R.drawable.select_image,
            R.drawable.select_milestone, R.drawable.select_video,
            R.drawable.select_milestone,
            R.drawable.select_milestone, R.drawable.select_video,
            R.drawable.select_video,R.drawable.select_video};

    MenuItemsAdapter mMenuItemsAdapter;


    @Override
    public void setContentView(int layoutResID) {

        mDrawer = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_base, null);
        FrameLayout activityContainer = (FrameLayout) mDrawer.findViewById(R.id.activity_content);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);

        super.setContentView(mDrawer);

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        menuItemsRecyclerView = (RecyclerView) findViewById(R.id.menuItemsRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        menuItemsRecyclerView.setLayoutManager(layoutManager);
        mMenuItemsAdapter = new MenuItemsAdapter(this, menuItems, menuItemImgs);
        menuItemsRecyclerView.setAdapter(mMenuItemsAdapter);


    }


}


