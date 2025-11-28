package com.farm.farmfresh;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.farm.farmfresh.ui.cart.CartFragment;
//import com.farm.farmfresh.ui.checkout.CheckoutFragment;
import com.farm.farmfresh.ui.checkout.CheckoutFragment;
import com.farm.farmfresh.ui.gallery.GalleryFragment;
import com.farm.farmfresh.ui.home.HomeFragment;
//import com.farm.farmfresh.ui.productdetailsFragment.ProductDetails;
import com.farm.farmfresh.ui.productdetails.ProductDetails;
import com.farm.farmfresh.ui.productitem.ProductItemFragment;
import com.farm.farmfresh.ui.slideshow.SlideshowFragment;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.farm.farmfresh.databinding.ActivityHomeBinding;




public class Home extends AppCompatActivity   implements NavigationView.OnNavigationItemSelectedListener {



    ActivityHomeBinding binding;
    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        toolbar = binding.appBarHome.toolbar;
        setSupportActionBar(toolbar);
        drawer = binding.drawerLayout;
        navigationView = binding.navView;


        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);

        }

        binding.appBarHome.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .setAnchorView(R.id.fab).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }






    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

//        if (R.id.logout == item.getItemId()) {
//
//            FirebaseAuth.getInstance().signOut();
//            Intent intent = new Intent(this, LoginEsp32.class);
//            startActivity(intent);
//        } else if (R.id.logout == item.getItemId()) {
//
//        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (R.id.nav_home == item.getItemId()) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);


        } else if (R.id.nav_gallery == item.getItemId()) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new GalleryFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_gallery);


        }else if (R.id.nav_slideshow == item.getItemId()) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new SlideshowFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_slideshow);


        }else if (R.id.nav_cart == item.getItemId()) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new CartFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_cart);



        }else if (R.id.nav_checkout == item.getItemId()) {
          getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new CheckoutFragment()).commit();
           navigationView.setCheckedItem(R.id.nav_checkout);

        }else if (R.id.nav_productitem == item.getItemId()) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new ProductItemFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_productitem);

        }



        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}







//1. The goto layout  then content_main :Delete NavigationView and replace with FragmentContainerView
//
//2. Delete Navigation Resource Dirrectory
//
//3. Paste Code Above In Main_Activity.java

//Updated Ends
//        }
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//                }